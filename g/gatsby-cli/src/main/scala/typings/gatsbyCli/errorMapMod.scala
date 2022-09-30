package typings.gatsbyCli

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMapMod {
  
  @js.native
  sealed trait ErrorCategory extends StObject
  @JSImport("gatsby-cli/lib/structured-errors/error-map", "ErrorCategory")
  @js.native
  object ErrorCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorCategory & String] = js.native
    
    @js.native
    sealed trait SYSTEM
      extends StObject
         with ErrorCategory
    /* "SYSTEM" */ val SYSTEM: typings.gatsbyCli.errorMapMod.ErrorCategory.SYSTEM & String = js.native
    
    @js.native
    sealed trait THIRD_PARTY
      extends StObject
         with ErrorCategory
    /* "THIRD_PARTY" */ val THIRD_PARTY: typings.gatsbyCli.errorMapMod.ErrorCategory.THIRD_PARTY & String = js.native
    
    @js.native
    sealed trait USER
      extends StObject
         with ErrorCategory
    /* "USER" */ val USER: typings.gatsbyCli.errorMapMod.ErrorCategory.USER & String = js.native
  }
  
  @JSImport("gatsby-cli/lib/structured-errors/error-map", "defaultError")
  @js.native
  val defaultError: IErrorMapEntry = js.native
  
  @JSImport("gatsby-cli/lib/structured-errors/error-map", "errorMap")
  @js.native
  val errorMap: Record[ErrorId, IErrorMapEntry] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.gatsbyCli.gatsbyCliStrings._empty
    - typings.gatsbyCli.gatsbyCliStrings.`95312`
    - typings.gatsbyCli.gatsbyCliStrings.`95313`
    - typings.gatsbyCli.gatsbyCliStrings.`95314`
    - typings.gatsbyCli.gatsbyCliStrings.`95315`
    - typings.gatsbyCli.gatsbyCliStrings.`98001`
    - typings.gatsbyCli.gatsbyCliStrings.`98011`
    - typings.gatsbyCli.gatsbyCliStrings.`98123`
    - typings.gatsbyCli.gatsbyCliStrings.`98124`
    - typings.gatsbyCli.gatsbyCliStrings.`85901`
    - typings.gatsbyCli.gatsbyCliStrings.`85907`
    - typings.gatsbyCli.gatsbyCliStrings.`85908`
    - typings.gatsbyCli.gatsbyCliStrings.`85909`
    - typings.gatsbyCli.gatsbyCliStrings.`85910`
    - typings.gatsbyCli.gatsbyCliStrings.`85911`
    - typings.gatsbyCli.gatsbyCliStrings.`85912`
    - typings.gatsbyCli.gatsbyCliStrings.`85913`
    - typings.gatsbyCli.gatsbyCliStrings.`85914`
    - typings.gatsbyCli.gatsbyCliStrings.`85915`
    - typings.gatsbyCli.gatsbyCliStrings.`85916`
    - typings.gatsbyCli.gatsbyCliStrings.`85917`
    - typings.gatsbyCli.gatsbyCliStrings.`85918`
    - typings.gatsbyCli.gatsbyCliStrings.`85919`
    - typings.gatsbyCli.gatsbyCliStrings.`85920`
    - typings.gatsbyCli.gatsbyCliStrings.`85921`
    - typings.gatsbyCli.gatsbyCliStrings.`85922`
    - typings.gatsbyCli.gatsbyCliStrings.`85923`
    - typings.gatsbyCli.gatsbyCliStrings.`85924`
    - typings.gatsbyCli.gatsbyCliStrings.`85925`
    - typings.gatsbyCli.gatsbyCliStrings.`85926`
    - typings.gatsbyCli.gatsbyCliStrings.`85927`
    - typings.gatsbyCli.gatsbyCliStrings.`85928`
    - typings.gatsbyCli.gatsbyCliStrings.`85929`
    - typings.gatsbyCli.gatsbyCliStrings.`10122`
    - typings.gatsbyCli.gatsbyCliStrings.`10123`
    - typings.gatsbyCli.gatsbyCliStrings.`10124`
    - typings.gatsbyCli.gatsbyCliStrings.`10125`
    - typings.gatsbyCli.gatsbyCliStrings.`10126`
    - typings.gatsbyCli.gatsbyCliStrings.`10127`
    - typings.gatsbyCli.gatsbyCliStrings.`10128`
    - typings.gatsbyCli.gatsbyCliStrings.`10226`
    - typings.gatsbyCli.gatsbyCliStrings.`11321`
    - typings.gatsbyCli.gatsbyCliStrings.`11322`
    - typings.gatsbyCli.gatsbyCliStrings.`11323`
    - typings.gatsbyCli.gatsbyCliStrings.`11324`
    - typings.gatsbyCli.gatsbyCliStrings.`11325`
    - typings.gatsbyCli.gatsbyCliStrings.`11326`
    - typings.gatsbyCli.gatsbyCliStrings.`11327`
    - typings.gatsbyCli.gatsbyCliStrings.`11328`
    - typings.gatsbyCli.gatsbyCliStrings.`11329`
    - typings.gatsbyCli.gatsbyCliStrings.`11330`
    - typings.gatsbyCli.gatsbyCliStrings.`11331`
    - typings.gatsbyCli.gatsbyCliStrings.`11332`
    - typings.gatsbyCli.gatsbyCliStrings.`11467`
    - typings.gatsbyCli.gatsbyCliStrings.`11521`
    - typings.gatsbyCli.gatsbyCliStrings.`11522`
    - typings.gatsbyCli.gatsbyCliStrings.`11610`
    - typings.gatsbyCli.gatsbyCliStrings.`11611`
    - typings.gatsbyCli.gatsbyCliStrings.`11612`
    - typings.gatsbyCli.gatsbyCliStrings.`11613`
    - typings.gatsbyCli.gatsbyCliStrings.`11614`
    - typings.gatsbyCli.gatsbyCliStrings.`11615`
    - typings.gatsbyCli.gatsbyCliStrings.`11616`
    - typings.gatsbyCli.gatsbyCliStrings.`11701`
    - typings.gatsbyCli.gatsbyCliStrings.`11801`
    - typings.gatsbyCli.gatsbyCliStrings.`11802`
    - typings.gatsbyCli.gatsbyCliStrings.`11805`
    - typings.gatsbyCli.gatsbyCliStrings.`11803`
    - typings.gatsbyCli.gatsbyCliStrings.`11804`
    - typings.gatsbyCli.gatsbyCliStrings.`11901`
    - typings.gatsbyCli.gatsbyCliStrings.`11902`
    - typings.gatsbyCli.gatsbyCliStrings.`11903`
    - typings.gatsbyCli.gatsbyCliStrings.`11904`
    - typings.gatsbyCli.gatsbyCliStrings.`12100`
    - typings.gatsbyCli.gatsbyCliStrings.`80000`
  */
  type ErrorId = _ErrorId | String
  
  trait IErrorMapEntry extends StObject {
    
    var category: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ] = js.undefined
    
    var docsUrl: js.UndefOr[String] = js.undefined
    
    var level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String
    
    def text(context: Any): String
    
    var `type`: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ] = js.undefined
  }
  object IErrorMapEntry {
    
    inline def apply(
      level: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String,
      text: Any => String
    ): IErrorMapEntry = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = js.Any.fromFunction1(text))
      __obj.asInstanceOf[IErrorMapEntry]
    }
    
    extension [Self <: IErrorMapEntry](x: Self) {
      
      inline def setCategory(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ErrorCategory * / any */ String
      ): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setDocsUrl(value: String): Self = StObject.set(x, "docsUrl", value.asInstanceOf[js.Any])
      
      inline def setDocsUrlUndefined: Self = StObject.set(x, "docsUrl", js.undefined)
      
      inline def setLevel(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Level * / any */ String
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setText(value: Any => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setType(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Type * / any */ String
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait _ErrorId extends StObject
}
