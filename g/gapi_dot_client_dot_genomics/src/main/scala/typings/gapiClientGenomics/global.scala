package typings.gapiClientGenomics

import typings.gapiClientGenomics.gapi.client.genomics.AnnotationsResource
import typings.gapiClientGenomics.gapi.client.genomics.AnnotationsetsResource
import typings.gapiClientGenomics.gapi.client.genomics.CallsetsResource
import typings.gapiClientGenomics.gapi.client.genomics.DatasetsResource
import typings.gapiClientGenomics.gapi.client.genomics.OperationsResource
import typings.gapiClientGenomics.gapi.client.genomics.ReadgroupsetsResource
import typings.gapiClientGenomics.gapi.client.genomics.ReadsResource
import typings.gapiClientGenomics.gapi.client.genomics.ReferencesResource
import typings.gapiClientGenomics.gapi.client.genomics.ReferencesetsResource
import typings.gapiClientGenomics.gapi.client.genomics.VariantsResource
import typings.gapiClientGenomics.gapi.client.genomics.VariantsetsResource
import typings.gapiClientGenomics.gapiClientGenomicsStrings.genomics
import typings.gapiClientGenomics.gapiClientGenomicsStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val annotations: AnnotationsResource = js.native
      val annotationsets: AnnotationsetsResource = js.native
      val callsets: CallsetsResource = js.native
      val datasets: DatasetsResource = js.native
      val operations: OperationsResource = js.native
      val readgroupsets: ReadgroupsetsResource = js.native
      val reads: ReadsResource = js.native
      val references: ReferencesResource = js.native
      val referencesets: ReferencesetsResource = js.native
      val variants: VariantsResource = js.native
      val variantsets: VariantsetsResource = js.native
      /** Load Genomics API v1 */
      def load(name: genomics, version: v1): js.Thenable[Unit] = js.native
      def load(name: genomics, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

