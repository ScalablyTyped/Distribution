package typings.fontagon

import typings.fontagon.mod.StyleSheetGenerationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontagonStrings {
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait css
    extends StObject
       with StyleSheetGenerationType
  inline def css: css = "css".asInstanceOf[css]
  
  @js.native
  sealed trait less
    extends StObject
       with StyleSheetGenerationType
  inline def less: less = "less".asInstanceOf[less]
  
  @js.native
  sealed trait sass
    extends StObject
       with StyleSheetGenerationType
  inline def sass: sass = "sass".asInstanceOf[sass]
  
  @js.native
  sealed trait stylus
    extends StObject
       with StyleSheetGenerationType
  inline def stylus: stylus = "stylus".asInstanceOf[stylus]
}
