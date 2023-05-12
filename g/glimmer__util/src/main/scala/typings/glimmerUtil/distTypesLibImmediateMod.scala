package typings.glimmerUtil

import typings.glimmerUtil.glimmerUtilInts.`-1073741824`
import typings.glimmerUtil.glimmerUtilInts.`-536870912`
import typings.glimmerUtil.glimmerUtilInts.`-536870913`
import typings.glimmerUtil.glimmerUtilInts.`0`
import typings.glimmerUtil.glimmerUtilInts.`1073741823`
import typings.glimmerUtil.glimmerUtilInts.`1`
import typings.glimmerUtil.glimmerUtilInts.`2`
import typings.glimmerUtil.glimmerUtilInts.`3`
import typings.glimmerUtil.glimmerUtilInts.`536870911`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibImmediateMod {
  
  @JSImport("@glimmer/util/dist/types/lib/immediate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constants(values: Any*): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("constants")(values.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Array[Any]]
  
  inline def decodeHandle(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeHandle")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def decodeImmediate(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeImmediate")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def decodeNegative(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeNegative")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def decodePositive(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePositive")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encodeHandle(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeHandle")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encodeImmediate(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeImmediate")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encodeNegative(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeNegative")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encodePositive(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodePositive")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isHandle(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHandle")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNonPrimitiveHandle(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNonPrimitiveHandle")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSmallInt(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSmallInt")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.glimmerUtil.glimmerUtilInts.`1073741823`
    - typings.glimmerUtil.glimmerUtilInts.`-1073741824`
    - typings.glimmerUtil.glimmerUtilInts.`-536870913`
    - typings.glimmerUtil.glimmerUtilInts.`536870911`
    - typings.glimmerUtil.glimmerUtilInts.`-536870912`
    - typings.glimmerUtil.glimmerUtilInts.`0`
    - typings.glimmerUtil.glimmerUtilInts.`1`
    - typings.glimmerUtil.glimmerUtilInts.`2`
    - typings.glimmerUtil.glimmerUtilInts.`3`
  */
  trait ImmediateConstants extends StObject
  object ImmediateConstants {
    
    inline def ENCODED_FALSE_HANDLE: `0` = 0.asInstanceOf[`0`]
    
    inline def ENCODED_NULL_HANDLE: `2` = 2.asInstanceOf[`2`]
    
    inline def ENCODED_TRUE_HANDLE: `1` = 1.asInstanceOf[`1`]
    
    inline def ENCODED_UNDEFINED_HANDLE: `3` = 3.asInstanceOf[`3`]
    
    inline def FALSE_HANDLE: `0` = 0.asInstanceOf[`0`]
    
    inline def MAX_INT: `536870911` = 536870911.asInstanceOf[`536870911`]
    
    inline def MAX_SMI: `1073741823` = 1073741823.asInstanceOf[`1073741823`]
    
    inline def MIN_INT: `-536870912` = -536870912.asInstanceOf[`-536870912`]
    
    inline def MIN_SMI: `-1073741824` = -1073741824.asInstanceOf[`-1073741824`]
    
    inline def NULL_HANDLE: `2` = 2.asInstanceOf[`2`]
    
    inline def SIGN_BIT: `-536870913` = -536870913.asInstanceOf[`-536870913`]
    
    inline def TRUE_HANDLE: `1` = 1.asInstanceOf[`1`]
    
    inline def UNDEFINED_HANDLE: `3` = 3.asInstanceOf[`3`]
  }
}
