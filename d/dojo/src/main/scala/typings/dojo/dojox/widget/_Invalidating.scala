package typings.dojo.dojox.widget

import typings.dojo.Anon_Unwatch
import typings.dojo.dojo.Stateful
import typings.dojo.dojoStrings.invalidRendering
import typings.dojo.dojoStrings.invalidatingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/_Invalidating.html
  *
  * Base class for classes (usually widgets) that watch invalidated properties and delay the rendering
  * after these properties modifications to the next execution frame.
  *
  */
@JSGlobal("dojox.widget._Invalidating")
@js.native
class _Invalidating () extends Stateful {
  /**
    *
    */
  var invalidRendering: Boolean = js.native
  /**
    *
    */
  var invalidatingProperties: js.Object = js.native
  /**
    * Add properties to the watched properties to trigger invalidation. This method must be called in
    * the constructor. It is typically used by subclasses of a _Invalidating class to add more properties
    * to watch for.
    *
    * @param properties The list of properties to watch for.
    */
  def addInvalidatingProperties(properties: js.Array[String]): Unit = js.native
  @JSName("get")
  def get_invalidRendering(property: invalidRendering): Boolean = js.native
  @JSName("get")
  def get_invalidatingProperties(property: invalidatingProperties): js.Object = js.native
  /**
    * Invalidating the rendering for the next executation frame.
    *
    */
  def invalidateRendering(): Unit = js.native
  /**
    *
    * @param mixin
    */
  def postscript(mixin: js.Any): Unit = js.native
  /**
    * Actually refresh the rendering. Implementation should implement that method.
    *
    */
  def refreshRendering(): Unit = js.native
  @JSName("set")
  def set_invalidRendering(property: invalidRendering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_invalidatingProperties(property: invalidatingProperties, value: js.Object): Unit = js.native
  /**
    * Immediately validate the rendering if it has been invalidated. You generally do not call that method yourself.
    *
    */
  def validateRendering(): Unit = js.native
  @JSName("watch")
  def watch_invalidRendering(
    property: invalidRendering,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidatingProperties(
    property: invalidatingProperties,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

