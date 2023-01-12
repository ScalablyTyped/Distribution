package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.elision
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisElisionTokenFilter
  extends StObject
     with AnalysisTokenFilterBase
     with AnalysisTokenFilterDefinition {
  
  var articles: js.UndefOr[js.Array[String]] = js.undefined
  
  var articles_case: js.UndefOr[Boolean] = js.undefined
  
  var articles_path: js.UndefOr[String] = js.undefined
  
  var `type`: elision
}
object AnalysisElisionTokenFilter {
  
  inline def apply(): AnalysisElisionTokenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("elision")
    __obj.asInstanceOf[AnalysisElisionTokenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisElisionTokenFilter] (val x: Self) extends AnyVal {
    
    inline def setArticles(value: js.Array[String]): Self = StObject.set(x, "articles", value.asInstanceOf[js.Any])
    
    inline def setArticlesUndefined: Self = StObject.set(x, "articles", js.undefined)
    
    inline def setArticlesVarargs(value: String*): Self = StObject.set(x, "articles", js.Array(value*))
    
    inline def setArticles_case(value: Boolean): Self = StObject.set(x, "articles_case", value.asInstanceOf[js.Any])
    
    inline def setArticles_caseUndefined: Self = StObject.set(x, "articles_case", js.undefined)
    
    inline def setArticles_path(value: String): Self = StObject.set(x, "articles_path", value.asInstanceOf[js.Any])
    
    inline def setArticles_pathUndefined: Self = StObject.set(x, "articles_path", js.undefined)
    
    inline def setType(value: elision): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
