package typings.dojo.dojox.gfx

import typings.dojo.dojox.gfx.shape.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/utils.html
  *
  *
  */
@js.native
trait utils extends js.Object {
  /**
    * Takes a surface or a shape and populates it with an object produced by serialize().
    *
    * @param parent The destination container for the deserialized shapes.
    * @param object The shapes to deserialize.
    */
  def deserialize(parent: Shape, `object`: js.Array[_]): js.Any = js.native
  /**
    * Takes a surface or a shape and populates it with an object produced by serialize().
    *
    * @param parent The destination container for the deserialized shapes.
    * @param object The shapes to deserialize.
    */
  def deserialize(parent: Shape, `object`: Shape): js.Any = js.native
  /**
    * Takes a shape or a surface and applies a function "f" to in the context of "o"
    * (or global, if missing). If "shape" was a surface or a group, it applies the same
    * function to all children recursively effectively visiting all shapes of the underlying scene graph.
    *
    * @param object The gfx container to iterate.
    * @param f The function to apply.
    * @param o               OptionalThe scope.
    */
  def forEach(`object`: Shape, f: String, o: js.Object): Unit = js.native
  /**
    * Takes a shape or a surface and applies a function "f" to in the context of "o"
    * (or global, if missing). If "shape" was a surface or a group, it applies the same
    * function to all children recursively effectively visiting all shapes of the underlying scene graph.
    *
    * @param object The gfx container to iterate.
    * @param f The function to apply.
    * @param o               OptionalThe scope.
    */
  def forEach(`object`: Shape, f: js.Array[_], o: js.Object): Unit = js.native
  /**
    * Takes a shape or a surface and applies a function "f" to in the context of "o"
    * (or global, if missing). If "shape" was a surface or a group, it applies the same
    * function to all children recursively effectively visiting all shapes of the underlying scene graph.
    *
    * @param object The gfx container to iterate.
    * @param f The function to apply.
    * @param o               OptionalThe scope.
    */
  def forEach(`object`: Shape, f: js.Function, o: js.Object): Unit = js.native
  /**
    * Works just like deserialize() but takes a JSON representation of the object.
    *
    * @param parent The destination container for the deserialized shapes.
    * @param json The shapes to deserialize.
    */
  def fromJson(parent: Shape, json: String): js.Any = js.native
  /**
    * Takes a shape or a surface and returns an object, which describes underlying shapes.
    *
    * @param object The container to serialize.
    */
  def serialize(`object`: Shape): js.Any = js.native
  /**
    * Works just like serialize() but returns a JSON string. If prettyPrint is true, the string is pretty-printed to make it more human-readable.
    *
    * @param object The container to serialize.
    * @param prettyPrint               OptionalIndicates whether the output string should be formatted.
    */
  def toJson(`object`: Shape, prettyPrint: Boolean): String = js.native
  /**
    * Function to serialize a GFX surface to SVG text.
    * Function to serialize a GFX surface to SVG text.  The value of this output
    * is that there are numerous serverside parser libraries that can render
    * SVG into images in various formats.  This provides a way that GFX objects
    * can be captured in a known format and sent serverside for serialization
    * into an image.
    *
    * @param surface The GFX surface to serialize.
    */
  def toSvg(surface: typings.dojo.dojox.gfx.shape.Surface): js.Any = js.native
}

