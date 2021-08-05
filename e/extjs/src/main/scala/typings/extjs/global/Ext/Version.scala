package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Version")
@js.native
class Version ()
  extends StObject
     with typings.extjs.Ext.Version
/* static members */
object Version {
  
  @JSGlobal("Ext.Version")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Compare 2 specified versions starting from left to right
    * @param current String The current version to compare to
    * @param target String The target version to compare to
    * @returns Number Returns -1 if the current version is smaller than the target version, 1 if greater, and 0 if they're equivalent
    */
  inline def compare(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")().asInstanceOf[Double]
  inline def compare(current: java.lang.String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(current.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def compare(current: java.lang.String, target: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def compare(current: Unit, target: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** [Method] Converts a version component to a comparable value
    * @param value Object The value to convert
    * @returns Object
    */
  inline def getComponentValue(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentValue")().asInstanceOf[js.Any]
  inline def getComponentValue(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentValue")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
