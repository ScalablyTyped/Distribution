package typings.fabric.mod.fabric

import typings.fabric.fabricImplMod.IPathOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Path")
@js.native
/**
  * Constructor
  * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  * @param [options] Options object
  */
class Path ()
  extends typings.fabric.fabricImplMod.Path {
  def this(path: String) = this()
  def this(path: js.Array[typings.fabric.fabricImplMod.Point]) = this()
  def this(path: String, options: IPathOptions) = this()
  def this(path: js.Array[typings.fabric.fabricImplMod.Point], options: IPathOptions) = this()
  def this(path: Unit, options: IPathOptions) = this()
}
/* static members */
object Path {
  
  @JSImport("fabric", "fabric.Path")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  @JSImport("fabric", "fabric.Path.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an instance of fabric.Path from an SVG <path> element
    * @param element to parse
    * @param callback Callback to invoke when an fabric.Path instance is created
    * @param [options] Options object
    */
  @scala.inline
  def fromElement(element: SVGElement, callback: js.Function): typings.fabric.fabricImplMod.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Path]
  @scala.inline
  def fromElement(element: SVGElement, callback: js.Function, options: IPathOptions): typings.fabric.fabricImplMod.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Path]
  
  /**
    * Creates an instance of fabric.Path from an object
    * @param callback Callback to invoke when an fabric.Path instance is created
    */
  @scala.inline
  def fromObject(`object`: js.Any, callback: js.Function): typings.fabric.fabricImplMod.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.fabric.fabricImplMod.Path]
}
