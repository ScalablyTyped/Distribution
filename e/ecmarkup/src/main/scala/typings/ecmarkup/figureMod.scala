package typings.ecmarkup

import typings.ecmarkup.contextMod.Context
import typings.ecmarkup.specMod.Spec
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object figureMod {
  
  @JSImport("ecmarkup/lib/Figure", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Figure {
    def this(spec: Spec, node: HTMLElement) = this()
    
    /* CompleteClass */
    var caption: String = js.native
    
    /* CompleteClass */
    var captionElem: HTMLElement | Null = js.native
    
    /* CompleteClass */
    var id: String | Null = js.native
    
    /* CompleteClass */
    var isInformative: Boolean = js.native
    
    /* CompleteClass */
    var number: Double = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
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
    
    @scala.inline
    def enter(hasSpecNode: Context): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enter")(hasSpecNode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Builder * / any */ trait Figure extends StObject {
    
    var caption: String
    
    var captionElem: HTMLElement | Null
    
    var id: String | Null
    
    var isInformative: Boolean
    
    var number: Double
    
    var `type`: String
  }
  object Figure {
    
    @scala.inline
    def apply(caption: String, isInformative: Boolean, number: Double, `type`: String): Figure = {
      val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], isInformative = isInformative.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], captionElem = null, id = null)
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
