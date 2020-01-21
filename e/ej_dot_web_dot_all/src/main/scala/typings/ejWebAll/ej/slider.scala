package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.slider")
@js.native
object slider extends js.Object {
  @js.native
  sealed trait sliderType extends js.Object
  
  @js.native
  object sliderType extends js.Object {
    //Shows default slider
    @js.native
    sealed trait Default extends sliderType
    
    //Shows minRange slider
    @js.native
    sealed trait MinRange extends sliderType
    
    //Shows Range slider
    @js.native
    sealed trait Range extends sliderType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[sliderType with Double] = js.native
    /* 0 */ @js.native
    object Default extends TopLevel[Default with Double]
    
    /* 1 */ @js.native
    object MinRange extends TopLevel[MinRange with Double]
    
    /* 2 */ @js.native
    object Range extends TopLevel[Range with Double]
    
  }
  
}

