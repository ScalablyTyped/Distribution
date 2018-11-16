package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImportReadGroupSetsRequest extends js.Object {
  /**
               * Required. The ID of the dataset these read group sets will belong to. The
               * caller must have WRITE permissions to this dataset.
               */
  var datasetId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The partition strategy describes how read groups are partitioned into read
               * group sets.
               */
  var partitionStrategy: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The reference set to which the imported read group sets are aligned to, if
               * any. The reference names of this reference set must be a superset of those
               * found in the imported file headers. If no reference set id is provided, a
               * best effort is made to associate with a matching reference set.
               */
  var referenceSetId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A list of URIs pointing at [BAM
               * files](https://samtools.github.io/hts-specs/SAMv1.pdf)
               * in Google Cloud Storage.
               * Those URIs can include wildcards (&#42;), but do not add or remove
               * matching files before import has completed.
               *
               * Note that Google Cloud Storage object listing is only eventually
               * consistent: files added may be not be immediately visible to
               * everyone. Thus, if using a wildcard it is preferable not to start
               * the import immediately after the files are created.
               */
  var sourceUris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

