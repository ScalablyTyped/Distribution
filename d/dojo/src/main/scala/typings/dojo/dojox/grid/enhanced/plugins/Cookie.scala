package typings.dojo.dojox.grid.enhanced.plugins

import typings.dojo.dojox.grid.enhanced.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/Cookie.html
  *
  * This plugin provides a way to persist some grid features in cookie.
  * Default persistable features are:
  * column width:   "columnWidth" (handler name)
  * column order:   "columnOrder"
  * sorting order:  "sortOrder"
  *
  * Grid users can define new persistable features
  * by calling the following before grid is initialized (that is, during "preInit");
  *
  * grid.addCookieHandler({
  *     name: "a name for the new persistable feature",
  *     onLoad: function(savedObject, grid){
  *         //load the cookie.
  *     },
  *     onSave: function(grid){
  *         //save the cookie.
  *     }
  * });
  *
  * @param grid
  * @param args
  */
@JSGlobal("dojox.grid.enhanced.plugins.Cookie")
@js.native
class Cookie protected () extends Plugin {
  def this(grid: js.Any, args: js.Any) = this()
  /**
    * If a grid plugin wants cookie service, call this.
    * This must be called during preInit.
    *
    * @param args An object with the following structure:{    name: "some-string",    onLoad: // void // function(// object //partOfCookie, // EDG //grid){...},    onSave: // object // function(// EDG //grid){...}}
    */
  def addCookieHandler(args: js.Object): Unit = js.native
  /**
    * A getter to check cookie support of a particular Grid feature.
    *
    * @param cookieName               OptionalName of a cookie handler if provided, otherwise for all cookies.
    */
  def getCookieEnabled(cookieName: String): js.Any = js.native
  /**
    * Remove cookie for this grid.
    *
    */
  def removeCookie(): Unit = js.native
  /**
    * A setter to enable|disable cookie support for a particular Grid feature.
    *
    * @param cookieName               OptionalName of a cookie handler if provided, otherwise for all cookies.
    * @param enabled
    */
  def setCookieEnabled(cookieName: String, enabled: Boolean): Unit = js.native
}

