package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateDocumentSimulation
  extends StObject
     with IngestSimulateDocumentSimulationKeys
     with /* property */ StringDictionary[
      String | Id | IndexName | IngestSimulateIngest | (Record[String, Any]) | SpecUtilsStringified[VersionNumber] | VersionType
    ]
object IngestSimulateDocumentSimulation {
  
  inline def apply(_id: Id, _index: IndexName, _ingest: IngestSimulateIngest, _source: Record[String, Any]): IngestSimulateDocumentSimulation = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _index = _index.asInstanceOf[js.Any], _ingest = _ingest.asInstanceOf[js.Any], _source = _source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulateDocumentSimulation]
  }
}
