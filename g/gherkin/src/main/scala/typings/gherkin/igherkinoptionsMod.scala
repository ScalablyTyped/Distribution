package typings.gherkin

import typings.cucumberMessages.idGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igherkinoptionsMod {
  
  @js.native
  trait IGherkinOptions extends StObject {
    
    var defaultDialect: js.UndefOr[String] = js.native
    
    var includeGherkinDocument: js.UndefOr[Boolean] = js.native
    
    var includePickles: js.UndefOr[Boolean] = js.native
    
    var includeSource: js.UndefOr[Boolean] = js.native
    
    var newId: js.UndefOr[NewId] = js.native
  }
  object IGherkinOptions {
    
    @scala.inline
    def apply(): IGherkinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGherkinOptions]
    }
    
    @scala.inline
    implicit class IGherkinOptionsMutableBuilder[Self <: IGherkinOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultDialect(value: String): Self = StObject.set(x, "defaultDialect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultDialectUndefined: Self = StObject.set(x, "defaultDialect", js.undefined)
      
      @scala.inline
      def setIncludeGherkinDocument(value: Boolean): Self = StObject.set(x, "includeGherkinDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGherkinDocumentUndefined: Self = StObject.set(x, "includeGherkinDocument", js.undefined)
      
      @scala.inline
      def setIncludePickles(value: Boolean): Self = StObject.set(x, "includePickles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePicklesUndefined: Self = StObject.set(x, "includePickles", js.undefined)
      
      @scala.inline
      def setIncludeSource(value: Boolean): Self = StObject.set(x, "includeSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSourceUndefined: Self = StObject.set(x, "includeSource", js.undefined)
      
      @scala.inline
      def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNewIdUndefined: Self = StObject.set(x, "newId", js.undefined)
    }
  }
}
