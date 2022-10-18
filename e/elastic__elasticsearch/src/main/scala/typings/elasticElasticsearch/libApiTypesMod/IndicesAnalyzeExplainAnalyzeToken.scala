package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAnalyzeExplainAnalyzeToken
  extends StObject
     with IndicesAnalyzeExplainAnalyzeTokenKeys
     with /* property */ StringDictionary[Any]
object IndicesAnalyzeExplainAnalyzeToken {
  
  inline def apply(
    bytes: String,
    end_offset: long,
    position: long,
    positionLength: long,
    start_offset: long,
    termFrequency: long,
    token: String,
    `type`: String
  ): IndicesAnalyzeExplainAnalyzeToken = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any], end_offset = end_offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positionLength = positionLength.asInstanceOf[js.Any], start_offset = start_offset.asInstanceOf[js.Any], termFrequency = termFrequency.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeExplainAnalyzeToken]
  }
}
