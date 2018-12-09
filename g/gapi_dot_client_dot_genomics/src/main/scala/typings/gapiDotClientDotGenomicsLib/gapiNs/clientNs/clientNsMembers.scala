package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val annotations: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.AnnotationsResource = js.native
  val annotationsets: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.AnnotationsetsResource = js.native
  val callsets: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.CallsetsResource = js.native
  val datasets: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.DatasetsResource = js.native
  val operations: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.OperationsResource = js.native
  val readgroupsets: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.ReadgroupsetsResource = js.native
  val reads: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.ReadsResource = js.native
  val references: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.ReferencesResource = js.native
  val referencesets: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.ReferencesetsResource = js.native
  val variants: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.VariantsResource = js.native
  val variantsets: gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs.VariantsetsResource = js.native
  /** Load Genomics API v1 */
  def load(
    name: gapiDotClientDotGenomicsLib.gapiDotClientDotGenomicsLibStrings.genomics,
    version: gapiDotClientDotGenomicsLib.gapiDotClientDotGenomicsLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotGenomicsLib.gapiDotClientDotGenomicsLibStrings.genomics,
    version: gapiDotClientDotGenomicsLib.gapiDotClientDotGenomicsLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

