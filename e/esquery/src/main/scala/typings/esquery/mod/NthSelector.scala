package typings.esquery.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.NthChild
  - typings.esquery.mod.NthLastChild
*/
trait NthSelector
  extends StObject
     with SubjectSelector
object NthSelector {
  
  inline def NthChild(index: NumericLiteral): typings.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-child")
    __obj.asInstanceOf[typings.esquery.mod.NthChild]
  }
  
  inline def NthLastChild(index: NumericLiteral): typings.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("nth-last-child")
    __obj.asInstanceOf[typings.esquery.mod.NthLastChild]
  }
}
