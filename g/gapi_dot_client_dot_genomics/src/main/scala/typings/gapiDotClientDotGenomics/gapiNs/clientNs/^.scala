package typings.gapiDotClientDotGenomics.gapiNs.clientNs

import typings.gapiDotClientDotGenomics.gapiDotClientDotGenomicsStrings.genomics
import typings.gapiDotClientDotGenomics.gapiDotClientDotGenomicsStrings.v1
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.AnnotationsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.AnnotationsetsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.CallsetsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.DatasetsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.OperationsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.ReadgroupsetsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.ReadsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.ReferencesResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.ReferencesetsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.VariantsResource
import typings.gapiDotClientDotGenomics.gapiNs.clientNs.genomicsNs.VariantsetsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
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

