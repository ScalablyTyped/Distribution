package typings.fbjs

import typings.fbjs.libUnicodeBidiDirectionMod.BidiDirection
import typings.fbjs.libUnicodeBidiDirectionMod.HTMLDir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fbjsStrings {
  
  @js.native
  sealed trait LTR
    extends StObject
       with BidiDirection
       with typings.fbjs.libUnicodeBidiServiceMod.BidiDirection
  inline def LTR: LTR = "LTR".asInstanceOf[LTR]
  
  @js.native
  sealed trait NEUTRAL
    extends StObject
       with BidiDirection
       with typings.fbjs.libUnicodeBidiServiceMod.BidiDirection
  inline def NEUTRAL: NEUTRAL = "NEUTRAL".asInstanceOf[NEUTRAL]
  
  @js.native
  sealed trait RTL
    extends StObject
       with BidiDirection
       with typings.fbjs.libUnicodeBidiServiceMod.BidiDirection
  inline def RTL: RTL = "RTL".asInstanceOf[RTL]
  
  @js.native
  sealed trait entries extends StObject
  inline def entries: entries = "entries".asInstanceOf[entries]
  
  @js.native
  sealed trait keys extends StObject
  inline def keys: keys = "keys".asInstanceOf[keys]
  
  @js.native
  sealed trait ltr_
    extends StObject
       with HTMLDir
  inline def ltr_ : ltr_ = "ltr".asInstanceOf[ltr_]
  
  @js.native
  sealed trait rtl_
    extends StObject
       with HTMLDir
  inline def rtl_ : rtl_ = "rtl".asInstanceOf[rtl_]
  
  @js.native
  sealed trait values extends StObject
  inline def values: values = "values".asInstanceOf[values]
}
