package typings.dojo.dojox.embed

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.embed.Flash")
@js.native
object Flash extends js.Object {
  /**
    * Create the set of passed methods on the Flash object
    * so that you can call that object directly, as opposed to having to
    * delve into the internal movie to do this.  Intended to make working
    * with Flash movies that use ExternalInterface much easier to use.
    *
    * @param obj
    * @param methods
    */
  @js.native
  trait proxy extends js.Object {
    def apply(obj: Flash, methods: String): Unit = js.native
    def apply(obj: Flash, methods: js.Array[_]): Unit = js.native
  }
  
  /**
    * Used as both a detection (i.e. if(dojox.embed.Flash.available){ })
    * and as a variable holding the major version of the player installed.
    *
    */
  var available: Double = js.native
  /**
    *
    */
  var domNode: js.Object = js.native
  /**
    *
    */
  var id: js.Object = js.native
  /**
    * Whether or not the Flash engine is available for use.
    *
    */
  var initialized: Boolean = js.native
  /**
    * The minimum supported version of the Flash Player, defaults to 8.
    *
    */
  var minSupported: Double = js.native
  /**
    *
    */
  var minimumRequired: js.Object = js.native
  /**
    *
    */
  var minimumVersion: Double = js.native
  /**
    *
    */
  var movie: js.Object = js.native
  /**
    * Whether or not the Flash Player installed is supported by dojox.embed.
    *
    */
  var supported: Boolean = js.native
  /**
    * The version of the installed Flash Player; takes the form of
    * { major, minor, rev }.  To get the major version, you'd do this:
    * var v=dojox.embed.Flash.version.major;
    *
    */
  var version: js.Object = js.native
  /**
    * Gets Flash movie by id.
    * Probably includes methods for outdated
    * browsers, but this should catch all cases.
    *
    * @param movieName The name of the SWF
    * @param doc The document, if not current window(not fully supported)
    */
  type byId = js.Function2[/* movieName */ String, /* doc */ js.Object, js.Any]
  /**
    * Public interface for destroying all the properties in this object.
    * Will also clean all proxied methods.
    *
    */
  type destroy = js.Function0[Unit]
  /**
    * Initialize (i.e. place and load) the movie based on kwArgs.
    *
    * @param kwArgs An object with the following properties:path (String): The URL of the movie to embed.id (String, optional): A unique key that will be used as the id of the created markup.  If you don'tprovide this, a unique key will be generated.width (Number, optional): The width of the embedded movie; the default value is 320px.height (Number, optional): The height of the embedded movie; the default value is 240pxminimumVersion (Number, optional): The minimum targeted version of the Flash Player (defaults to 9)style (String, optional): Any CSS style information (i.e. style="background-color:transparent") you wantto define on the markup.params (Object, optional): A set of key/value pairs that you want to define in the resultant markup.vars (Object, optional): A set of key/value pairs that the Flash movie will interpret as FlashVars.expressInstall (Boolean, optional): Whether or not to include any kind of expressInstall info. Default is false.redirect (String, optional): A url to redirect the browser to if the current Flash version is not supported.
    * @param node               Optional
    */
  type init = js.Function2[/* kwArgs */ js.Object, /* node */ HTMLElement, Unit]
  /**
    *
    * @param kwArgs
    * @param node
    */
  type place = js.Function2[/* kwArgs */ js.Any, /* node */ js.Any, Unit]
}

