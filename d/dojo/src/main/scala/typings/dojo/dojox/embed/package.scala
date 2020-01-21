package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object embed {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/embed/Flash.html
    *
    * Create a wrapper object around a Flash movie; this is the DojoX equivilent
    * to SWFObject.
    * Creates a wrapper object around a Flash movie.  Wrapper object will
    * insert the movie reference in node; when the browser first starts
    * grabbing the movie, onReady will be fired; when the movie has finished
    * loading, it will fire onLoad.
    *
    * If your movie uses ExternalInterface, you should use the onLoad event
    * to do any kind of proxy setup (see dojox.embed.Flash.proxy); this seems
    * to be the only consistent time calling EI methods are stable (since the
    * Flash movie will shoot several methods into the window object before
    * EI callbacks can be used properly).
    *
    * @param kwArgs The various arguments that will be used to help define the Flash movie.
    * @param node The node where the embed object will be placed
    */
  type Flash = js.Function2[/* kwArgs */ js.Object, /* node */ typings.std.HTMLElement, scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/embed/Quicktime.html
    *
    * Returns a reference to the HTMLObject/HTMLEmbed that is created to
    * place the movie in the document.  You can use this either with or
    * without the new operator.  Note that with any other DOM manipulation,
    * you must wait until the document is finished loading before trying
    * to use this.
    *
    * @param kwArgs
    * @param node
    */
  type Quicktime = js.Function2[/* kwArgs */ js.Object, /* node */ typings.std.HTMLElement, scala.Unit]
}
