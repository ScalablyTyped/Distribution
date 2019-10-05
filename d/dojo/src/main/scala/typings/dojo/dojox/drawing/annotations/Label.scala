package typings.dojo.dojox.drawing.annotations

import typings.dojo.dojox.drawing.stencil.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/annotations/Label.html
  *
  *
  */
trait Label extends js.Object {
  /**
    *
    */
  def Label(): Unit
}

@JSGlobal("dojox.drawing.annotations.Label")
@js.native
object Label extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/annotations/Label.Label.html
    *
    * An annotation called internally to label an Stencil.
    * Annotation is positioned with dojox.drawing.util.positioning.label
    * That method should be overwritten for custom placement. Or,
    * add a 'setLabelCustom' method to the Stencil and it will be used.
    *
    * @param options One key value: the stencil that called this.
    */
  @js.native
  class Label protected () extends Text {
    def this(options: js.Object) = this()
    /**
      *
      * @param key
      * @param value alias name: 'cent', 'pound' ..
      */
    def beforeAttr(key: js.Any, value: String): Unit = js.native
    /**
      * Attaches to custom positioning within a Stencil
      *
      * @param text
      */
    def setLabelCustom(text: String): Unit = js.native
  }
  
}

