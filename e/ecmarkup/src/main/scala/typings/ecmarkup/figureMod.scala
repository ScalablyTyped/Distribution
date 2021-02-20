package typings.ecmarkup

import typings.ecmarkup.contextMod.Context
import typings.ecmarkup.specMod.Spec
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object figureMod {
  
  @JSImport("ecmarkup/lib/Figure", JSImport.Default)
  @js.native
  class default protected () extends Figure {
    def this(spec: Spec, node: HTMLElement) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ecmarkup/lib/Figure", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ecmarkup/lib/Figure", "default.elements")
    @js.native
    def elements: js.Array[String] = js.native
    @scala.inline
    def elements_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elements")(x.asInstanceOf[js.Any])
    
    @JSImport("ecmarkup/lib/Figure", "default.enter")
    @js.native
    def enter(hasSpecNode: Context): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder * / any */ @js.native
  trait Figure extends StObject {
    
    var caption: String = js.native
    
    var captionElem: HTMLElement | Null = js.native
    
    var id: String | Null = js.native
    
    var isInformative: Boolean = js.native
    
    var number: Double = js.native
    
    var `type`: String = js.native
  }
  object Figure {
    
    @scala.inline
    def apply(caption: String, isInformative: Boolean, number: Double, `type`: String): Figure = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], isInformative = isInformative.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Figure]
    }
    
    @scala.inline
    implicit class FigureMutableBuilder[Self <: Figure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElem(value: HTMLElement): Self = StObject.set(x, "captionElem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionElemNull: Self = StObject.set(x, "captionElem", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdNull: Self = StObject.set(x, "id", null)
      
      @scala.inline
      def setIsInformative(value: Boolean): Self = StObject.set(x, "isInformative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
