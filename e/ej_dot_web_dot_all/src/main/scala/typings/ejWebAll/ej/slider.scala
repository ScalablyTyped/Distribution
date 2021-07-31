package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slider {
  
  @js.native
  sealed trait sliderType extends StObject
  @JSGlobal("ej.slider.sliderType")
  @js.native
  object sliderType extends StObject {
    
    //Shows default slider
    @js.native
    sealed trait Default
      extends StObject
         with sliderType
    
    //Shows minRange slider
    @js.native
    sealed trait MinRange
      extends StObject
         with sliderType
    
    //Shows Range slider
    @js.native
    sealed trait Range
      extends StObject
         with sliderType
  }
}
