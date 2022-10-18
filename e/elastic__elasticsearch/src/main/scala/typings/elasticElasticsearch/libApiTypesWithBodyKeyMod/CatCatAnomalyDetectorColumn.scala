package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.elasticElasticsearch.elasticElasticsearchStrings.assignment_explanation
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ae
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDotcount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bc
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotexp_avg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.btea
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeExpAvg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotexp_avg_hour
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bteah
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeExpAvgHour
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.btmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeMax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.btmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeMin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDottotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.btt
  - typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeTotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotbuckets
  - typings.elasticElasticsearch.elasticElasticsearchStrings.db
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataBuckets
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotearliest_record
  - typings.elasticElasticsearch.elasticElasticsearchStrings.der
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataEarliestRecord
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotempty_buckets
  - typings.elasticElasticsearch.elasticElasticsearchStrings.deb
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataEmptyBuckets
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_bytes
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dib
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputBytes
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_fields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dif
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputFields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_records
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dir
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputRecords
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinvalid_dates
  - typings.elasticElasticsearch.elasticElasticsearchStrings.did
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataInvalidDates
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dl
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataLast
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast_empty_bucket
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dleb
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataLastEmptyBucket
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast_sparse_bucket
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dlsb
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataLastSparseBucket
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlatest_record
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dlr
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataLatestRecord
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotmissing_fields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dmf
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataMissingFields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotout_of_order_timestamps
  - typings.elasticElasticsearch.elasticElasticsearchStrings.doot
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataOutOfOrderTimestamps
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotprocessed_fields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dpf
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataProcessedFields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotprocessed_records
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dpr
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataProcessedRecords
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotsparse_buckets
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dsb
  - typings.elasticElasticsearch.elasticElasticsearchStrings.dataSparseBuckets
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotavg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.fmavg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryAvg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.fmmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryMax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.fmmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryMin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDottotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.fmt
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryTotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotavg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.fravg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsAvg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.frmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsMax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.frmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsMin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDottotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.frt
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsTotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotavg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ftavg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeAvg
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ftmax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeMax
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ftmin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeMin
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDottotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ftt
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeTotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ft
  - typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTotal
  - typings.elasticElasticsearch.elasticElasticsearchStrings.id
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbucket_allocation_failures
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mbaf
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelBucketAllocationFailures
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotby_fields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mbf
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelByFields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbytes
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mb
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelBytes
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbytes_exceeded
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mbe
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelBytesExceeded
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotcategorization_status
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mcs
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelCategorizationStatus
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotcategorized_doc_count
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mcdc
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelCategorizedDocCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotdead_category_count
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mdcc
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDeadCategoryCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotfailed_category_count
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelFailedCategoryCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotfrequent_category_count
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mfcc
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelFrequentCategoryCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotlog_time
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mlt
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelLogTime
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotmemory_limit
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mml
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelMemoryLimit
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotmemory_status
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mms
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelMemoryStatus
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotover_fields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mof
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelOverFields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotpartition_fields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mpf
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelPartitionFields
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotrare_category_count
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mrcc
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelRareCategoryCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDottimestamp
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mt
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelTimestamp
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelDottotal_category_count
  - typings.elasticElasticsearch.elasticElasticsearchStrings.mtcc
  - typings.elasticElasticsearch.elasticElasticsearchStrings.modelTotalCategoryCount
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotaddress
  - typings.elasticElasticsearch.elasticElasticsearchStrings.na
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeAddress
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotephemeral_id
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ne
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeEphemeralId
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotid
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ni
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeId
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotname
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nn
  - typings.elasticElasticsearch.elasticElasticsearchStrings.nodeName
  - typings.elasticElasticsearch.elasticElasticsearchStrings.opened_time
  - typings.elasticElasticsearch.elasticElasticsearchStrings.ot
  - typings.elasticElasticsearch.elasticElasticsearchStrings.state
  - typings.elasticElasticsearch.elasticElasticsearchStrings.s
*/
trait CatCatAnomalyDetectorColumn extends StObject
object CatCatAnomalyDetectorColumn {
  
  inline def ae: typings.elasticElasticsearch.elasticElasticsearchStrings.ae = "ae".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ae]
  
  inline def assignment_explanation: typings.elasticElasticsearch.elasticElasticsearchStrings.assignment_explanation = "assignment_explanation".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.assignment_explanation]
  
  inline def bc: typings.elasticElasticsearch.elasticElasticsearchStrings.bc = "bc".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bc]
  
  inline def btea: typings.elasticElasticsearch.elasticElasticsearchStrings.btea = "btea".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.btea]
  
  inline def bteah: typings.elasticElasticsearch.elasticElasticsearchStrings.bteah = "bteah".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bteah]
  
  inline def btmax: typings.elasticElasticsearch.elasticElasticsearchStrings.btmax = "btmax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.btmax]
  
  inline def btmin: typings.elasticElasticsearch.elasticElasticsearchStrings.btmin = "btmin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.btmin]
  
  inline def btt: typings.elasticElasticsearch.elasticElasticsearchStrings.btt = "btt".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.btt]
  
  inline def bucketsCount: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsCount = "bucketsCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsCount]
  
  inline def bucketsDotcount: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDotcount = "buckets.count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDotcount]
  
  inline def bucketsDottimeDotexp_avg: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotexp_avg = "buckets.time.exp_avg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotexp_avg]
  
  inline def bucketsDottimeDotexp_avg_hour: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotexp_avg_hour = "buckets.time.exp_avg_hour".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotexp_avg_hour]
  
  inline def bucketsDottimeDotmax: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotmax = "buckets.time.max".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotmax]
  
  inline def bucketsDottimeDotmin: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotmin = "buckets.time.min".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDotmin]
  
  inline def bucketsDottimeDottotal: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDottotal = "buckets.time.total".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsDottimeDottotal]
  
  inline def bucketsTimeExpAvg: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeExpAvg = "bucketsTimeExpAvg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeExpAvg]
  
  inline def bucketsTimeExpAvgHour: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeExpAvgHour = "bucketsTimeExpAvgHour".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeExpAvgHour]
  
  inline def bucketsTimeMax: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeMax = "bucketsTimeMax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeMax]
  
  inline def bucketsTimeMin: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeMin = "bucketsTimeMin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeMin]
  
  inline def bucketsTimeTotal: typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeTotal = "bucketsTimeTotal".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.bucketsTimeTotal]
  
  inline def dataBuckets: typings.elasticElasticsearch.elasticElasticsearchStrings.dataBuckets = "dataBuckets".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataBuckets]
  
  inline def dataDotbuckets: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotbuckets = "data.buckets".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotbuckets]
  
  inline def dataDotearliest_record: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotearliest_record = "data.earliest_record".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotearliest_record]
  
  inline def dataDotempty_buckets: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotempty_buckets = "data.empty_buckets".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotempty_buckets]
  
  inline def dataDotinput_bytes: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_bytes = "data.input_bytes".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_bytes]
  
  inline def dataDotinput_fields: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_fields = "data.input_fields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_fields]
  
  inline def dataDotinput_records: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_records = "data.input_records".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinput_records]
  
  inline def dataDotinvalid_dates: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinvalid_dates = "data.invalid_dates".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotinvalid_dates]
  
  inline def dataDotlast: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast = "data.last".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast]
  
  inline def dataDotlast_empty_bucket: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast_empty_bucket = "data.last_empty_bucket".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast_empty_bucket]
  
  inline def dataDotlast_sparse_bucket: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast_sparse_bucket = "data.last_sparse_bucket".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlast_sparse_bucket]
  
  inline def dataDotlatest_record: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlatest_record = "data.latest_record".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotlatest_record]
  
  inline def dataDotmissing_fields: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotmissing_fields = "data.missing_fields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotmissing_fields]
  
  inline def dataDotout_of_order_timestamps: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotout_of_order_timestamps = "data.out_of_order_timestamps".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotout_of_order_timestamps]
  
  inline def dataDotprocessed_fields: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotprocessed_fields = "data.processed_fields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotprocessed_fields]
  
  inline def dataDotprocessed_records: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotprocessed_records = "data.processed_records".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotprocessed_records]
  
  inline def dataDotsparse_buckets: typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotsparse_buckets = "data.sparse_buckets".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataDotsparse_buckets]
  
  inline def dataEarliestRecord: typings.elasticElasticsearch.elasticElasticsearchStrings.dataEarliestRecord = "dataEarliestRecord".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataEarliestRecord]
  
  inline def dataEmptyBuckets: typings.elasticElasticsearch.elasticElasticsearchStrings.dataEmptyBuckets = "dataEmptyBuckets".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataEmptyBuckets]
  
  inline def dataInputBytes: typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputBytes = "dataInputBytes".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputBytes]
  
  inline def dataInputFields: typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputFields = "dataInputFields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputFields]
  
  inline def dataInputRecords: typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputRecords = "dataInputRecords".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataInputRecords]
  
  inline def dataInvalidDates: typings.elasticElasticsearch.elasticElasticsearchStrings.dataInvalidDates = "dataInvalidDates".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataInvalidDates]
  
  inline def dataLast: typings.elasticElasticsearch.elasticElasticsearchStrings.dataLast = "dataLast".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataLast]
  
  inline def dataLastEmptyBucket: typings.elasticElasticsearch.elasticElasticsearchStrings.dataLastEmptyBucket = "dataLastEmptyBucket".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataLastEmptyBucket]
  
  inline def dataLastSparseBucket: typings.elasticElasticsearch.elasticElasticsearchStrings.dataLastSparseBucket = "dataLastSparseBucket".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataLastSparseBucket]
  
  inline def dataLatestRecord: typings.elasticElasticsearch.elasticElasticsearchStrings.dataLatestRecord = "dataLatestRecord".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataLatestRecord]
  
  inline def dataMissingFields: typings.elasticElasticsearch.elasticElasticsearchStrings.dataMissingFields = "dataMissingFields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataMissingFields]
  
  inline def dataOutOfOrderTimestamps: typings.elasticElasticsearch.elasticElasticsearchStrings.dataOutOfOrderTimestamps = "dataOutOfOrderTimestamps".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataOutOfOrderTimestamps]
  
  inline def dataProcessedFields: typings.elasticElasticsearch.elasticElasticsearchStrings.dataProcessedFields = "dataProcessedFields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataProcessedFields]
  
  inline def dataProcessedRecords: typings.elasticElasticsearch.elasticElasticsearchStrings.dataProcessedRecords = "dataProcessedRecords".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataProcessedRecords]
  
  inline def dataSparseBuckets: typings.elasticElasticsearch.elasticElasticsearchStrings.dataSparseBuckets = "dataSparseBuckets".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dataSparseBuckets]
  
  inline def db: typings.elasticElasticsearch.elasticElasticsearchStrings.db = "db".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.db]
  
  inline def deb: typings.elasticElasticsearch.elasticElasticsearchStrings.deb = "deb".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.deb]
  
  inline def der: typings.elasticElasticsearch.elasticElasticsearchStrings.der = "der".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.der]
  
  inline def dib: typings.elasticElasticsearch.elasticElasticsearchStrings.dib = "dib".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dib]
  
  inline def did: typings.elasticElasticsearch.elasticElasticsearchStrings.did = "did".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.did]
  
  inline def dif: typings.elasticElasticsearch.elasticElasticsearchStrings.dif = "dif".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dif]
  
  inline def dir: typings.elasticElasticsearch.elasticElasticsearchStrings.dir = "dir".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dir]
  
  inline def dl: typings.elasticElasticsearch.elasticElasticsearchStrings.dl = "dl".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dl]
  
  inline def dleb: typings.elasticElasticsearch.elasticElasticsearchStrings.dleb = "dleb".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dleb]
  
  inline def dlr: typings.elasticElasticsearch.elasticElasticsearchStrings.dlr = "dlr".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dlr]
  
  inline def dlsb: typings.elasticElasticsearch.elasticElasticsearchStrings.dlsb = "dlsb".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dlsb]
  
  inline def dmf: typings.elasticElasticsearch.elasticElasticsearchStrings.dmf = "dmf".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dmf]
  
  inline def doot: typings.elasticElasticsearch.elasticElasticsearchStrings.doot = "doot".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.doot]
  
  inline def dpf: typings.elasticElasticsearch.elasticElasticsearchStrings.dpf = "dpf".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dpf]
  
  inline def dpr: typings.elasticElasticsearch.elasticElasticsearchStrings.dpr = "dpr".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dpr]
  
  inline def dsb: typings.elasticElasticsearch.elasticElasticsearchStrings.dsb = "dsb".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.dsb]
  
  inline def fmavg: typings.elasticElasticsearch.elasticElasticsearchStrings.fmavg = "fmavg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.fmavg]
  
  inline def fmmax: typings.elasticElasticsearch.elasticElasticsearchStrings.fmmax = "fmmax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.fmmax]
  
  inline def fmmin: typings.elasticElasticsearch.elasticElasticsearchStrings.fmmin = "fmmin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.fmmin]
  
  inline def fmt: typings.elasticElasticsearch.elasticElasticsearchStrings.fmt = "fmt".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.fmt]
  
  inline def forecastsDotmemoryDotavg: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotavg = "forecasts.memory.avg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotavg]
  
  inline def forecastsDotmemoryDotmax: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotmax = "forecasts.memory.max".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotmax]
  
  inline def forecastsDotmemoryDotmin: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotmin = "forecasts.memory.min".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDotmin]
  
  inline def forecastsDotmemoryDottotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDottotal = "forecasts.memory.total".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotmemoryDottotal]
  
  inline def forecastsDotrecordsDotavg: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotavg = "forecasts.records.avg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotavg]
  
  inline def forecastsDotrecordsDotmax: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotmax = "forecasts.records.max".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotmax]
  
  inline def forecastsDotrecordsDotmin: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotmin = "forecasts.records.min".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDotmin]
  
  inline def forecastsDotrecordsDottotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDottotal = "forecasts.records.total".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDotrecordsDottotal]
  
  inline def forecastsDottimeDotavg: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotavg = "forecasts.time.avg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotavg]
  
  inline def forecastsDottimeDotmax: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotmax = "forecasts.time.max".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotmax]
  
  inline def forecastsDottimeDotmin: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotmin = "forecasts.time.min".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDotmin]
  
  inline def forecastsDottimeDottotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDottotal = "forecasts.time.total".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottimeDottotal]
  
  inline def forecastsDottotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottotal = "forecasts.total".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsDottotal]
  
  inline def forecastsMemoryAvg: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryAvg = "forecastsMemoryAvg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryAvg]
  
  inline def forecastsMemoryMax: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryMax = "forecastsMemoryMax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryMax]
  
  inline def forecastsMemoryMin: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryMin = "forecastsMemoryMin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryMin]
  
  inline def forecastsMemoryTotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryTotal = "forecastsMemoryTotal".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsMemoryTotal]
  
  inline def forecastsRecordsAvg: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsAvg = "forecastsRecordsAvg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsAvg]
  
  inline def forecastsRecordsMax: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsMax = "forecastsRecordsMax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsMax]
  
  inline def forecastsRecordsMin: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsMin = "forecastsRecordsMin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsMin]
  
  inline def forecastsRecordsTotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsTotal = "forecastsRecordsTotal".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsRecordsTotal]
  
  inline def forecastsTimeAvg: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeAvg = "forecastsTimeAvg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeAvg]
  
  inline def forecastsTimeMax: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeMax = "forecastsTimeMax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeMax]
  
  inline def forecastsTimeMin: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeMin = "forecastsTimeMin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeMin]
  
  inline def forecastsTimeTotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeTotal = "forecastsTimeTotal".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTimeTotal]
  
  inline def forecastsTotal: typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTotal = "forecastsTotal".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.forecastsTotal]
  
  inline def fravg: typings.elasticElasticsearch.elasticElasticsearchStrings.fravg = "fravg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.fravg]
  
  inline def frmax: typings.elasticElasticsearch.elasticElasticsearchStrings.frmax = "frmax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.frmax]
  
  inline def frmin: typings.elasticElasticsearch.elasticElasticsearchStrings.frmin = "frmin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.frmin]
  
  inline def frt: typings.elasticElasticsearch.elasticElasticsearchStrings.frt = "frt".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.frt]
  
  inline def ft: typings.elasticElasticsearch.elasticElasticsearchStrings.ft = "ft".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ft]
  
  inline def ftavg: typings.elasticElasticsearch.elasticElasticsearchStrings.ftavg = "ftavg".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ftavg]
  
  inline def ftmax: typings.elasticElasticsearch.elasticElasticsearchStrings.ftmax = "ftmax".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ftmax]
  
  inline def ftmin: typings.elasticElasticsearch.elasticElasticsearchStrings.ftmin = "ftmin".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ftmin]
  
  inline def ftt: typings.elasticElasticsearch.elasticElasticsearchStrings.ftt = "ftt".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ftt]
  
  inline def id: typings.elasticElasticsearch.elasticElasticsearchStrings.id = "id".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.id]
  
  inline def mb: typings.elasticElasticsearch.elasticElasticsearchStrings.mb = "mb".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mb]
  
  inline def mbaf: typings.elasticElasticsearch.elasticElasticsearchStrings.mbaf = "mbaf".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mbaf]
  
  inline def mbe: typings.elasticElasticsearch.elasticElasticsearchStrings.mbe = "mbe".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mbe]
  
  inline def mbf: typings.elasticElasticsearch.elasticElasticsearchStrings.mbf = "mbf".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mbf]
  
  inline def mcdc: typings.elasticElasticsearch.elasticElasticsearchStrings.mcdc = "mcdc".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mcdc]
  
  inline def mcs: typings.elasticElasticsearch.elasticElasticsearchStrings.mcs = "mcs".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mcs]
  
  inline def mdcc: typings.elasticElasticsearch.elasticElasticsearchStrings.mdcc = "mdcc".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mdcc]
  
  inline def mfcc: typings.elasticElasticsearch.elasticElasticsearchStrings.mfcc = "mfcc".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mfcc]
  
  inline def mlt: typings.elasticElasticsearch.elasticElasticsearchStrings.mlt = "mlt".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mlt]
  
  inline def mml: typings.elasticElasticsearch.elasticElasticsearchStrings.mml = "mml".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mml]
  
  inline def mms: typings.elasticElasticsearch.elasticElasticsearchStrings.mms = "mms".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mms]
  
  inline def modelBucketAllocationFailures: typings.elasticElasticsearch.elasticElasticsearchStrings.modelBucketAllocationFailures = "modelBucketAllocationFailures".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelBucketAllocationFailures]
  
  inline def modelByFields: typings.elasticElasticsearch.elasticElasticsearchStrings.modelByFields = "modelByFields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelByFields]
  
  inline def modelBytes: typings.elasticElasticsearch.elasticElasticsearchStrings.modelBytes = "modelBytes".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelBytes]
  
  inline def modelBytesExceeded: typings.elasticElasticsearch.elasticElasticsearchStrings.modelBytesExceeded = "modelBytesExceeded".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelBytesExceeded]
  
  inline def modelCategorizationStatus: typings.elasticElasticsearch.elasticElasticsearchStrings.modelCategorizationStatus = "modelCategorizationStatus".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelCategorizationStatus]
  
  inline def modelCategorizedDocCount: typings.elasticElasticsearch.elasticElasticsearchStrings.modelCategorizedDocCount = "modelCategorizedDocCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelCategorizedDocCount]
  
  inline def modelDeadCategoryCount: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDeadCategoryCount = "modelDeadCategoryCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDeadCategoryCount]
  
  inline def modelDotbucket_allocation_failures: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbucket_allocation_failures = "model.bucket_allocation_failures".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbucket_allocation_failures]
  
  inline def modelDotby_fields: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotby_fields = "model.by_fields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotby_fields]
  
  inline def modelDotbytes: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbytes = "model.bytes".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbytes]
  
  inline def modelDotbytes_exceeded: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbytes_exceeded = "model.bytes_exceeded".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotbytes_exceeded]
  
  inline def modelDotcategorization_status: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotcategorization_status = "model.categorization_status".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotcategorization_status]
  
  inline def modelDotcategorized_doc_count: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotcategorized_doc_count = "model.categorized_doc_count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotcategorized_doc_count]
  
  inline def modelDotdead_category_count: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotdead_category_count = "model.dead_category_count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotdead_category_count]
  
  inline def modelDotfailed_category_count: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotfailed_category_count = "model.failed_category_count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotfailed_category_count]
  
  inline def modelDotfrequent_category_count: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotfrequent_category_count = "model.frequent_category_count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotfrequent_category_count]
  
  inline def modelDotlog_time: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotlog_time = "model.log_time".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotlog_time]
  
  inline def modelDotmemory_limit: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotmemory_limit = "model.memory_limit".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotmemory_limit]
  
  inline def modelDotmemory_status: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotmemory_status = "model.memory_status".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotmemory_status]
  
  inline def modelDotover_fields: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotover_fields = "model.over_fields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotover_fields]
  
  inline def modelDotpartition_fields: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotpartition_fields = "model.partition_fields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotpartition_fields]
  
  inline def modelDotrare_category_count: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotrare_category_count = "model.rare_category_count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDotrare_category_count]
  
  inline def modelDottimestamp: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDottimestamp = "model.timestamp".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDottimestamp]
  
  inline def modelDottotal_category_count: typings.elasticElasticsearch.elasticElasticsearchStrings.modelDottotal_category_count = "model.total_category_count".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelDottotal_category_count]
  
  inline def modelFailedCategoryCount: typings.elasticElasticsearch.elasticElasticsearchStrings.modelFailedCategoryCount = "modelFailedCategoryCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelFailedCategoryCount]
  
  inline def modelFrequentCategoryCount: typings.elasticElasticsearch.elasticElasticsearchStrings.modelFrequentCategoryCount = "modelFrequentCategoryCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelFrequentCategoryCount]
  
  inline def modelLogTime: typings.elasticElasticsearch.elasticElasticsearchStrings.modelLogTime = "modelLogTime".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelLogTime]
  
  inline def modelMemoryLimit: typings.elasticElasticsearch.elasticElasticsearchStrings.modelMemoryLimit = "modelMemoryLimit".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelMemoryLimit]
  
  inline def modelMemoryStatus: typings.elasticElasticsearch.elasticElasticsearchStrings.modelMemoryStatus = "modelMemoryStatus".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelMemoryStatus]
  
  inline def modelOverFields: typings.elasticElasticsearch.elasticElasticsearchStrings.modelOverFields = "modelOverFields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelOverFields]
  
  inline def modelPartitionFields: typings.elasticElasticsearch.elasticElasticsearchStrings.modelPartitionFields = "modelPartitionFields".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelPartitionFields]
  
  inline def modelRareCategoryCount: typings.elasticElasticsearch.elasticElasticsearchStrings.modelRareCategoryCount = "modelRareCategoryCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelRareCategoryCount]
  
  inline def modelTimestamp: typings.elasticElasticsearch.elasticElasticsearchStrings.modelTimestamp = "modelTimestamp".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelTimestamp]
  
  inline def modelTotalCategoryCount: typings.elasticElasticsearch.elasticElasticsearchStrings.modelTotalCategoryCount = "modelTotalCategoryCount".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.modelTotalCategoryCount]
  
  inline def mof: typings.elasticElasticsearch.elasticElasticsearchStrings.mof = "mof".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mof]
  
  inline def mpf: typings.elasticElasticsearch.elasticElasticsearchStrings.mpf = "mpf".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mpf]
  
  inline def mrcc: typings.elasticElasticsearch.elasticElasticsearchStrings.mrcc = "mrcc".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mrcc]
  
  inline def mt: typings.elasticElasticsearch.elasticElasticsearchStrings.mt = "mt".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mt]
  
  inline def mtcc: typings.elasticElasticsearch.elasticElasticsearchStrings.mtcc = "mtcc".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.mtcc]
  
  inline def na: typings.elasticElasticsearch.elasticElasticsearchStrings.na = "na".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.na]
  
  inline def ne: typings.elasticElasticsearch.elasticElasticsearchStrings.ne = "ne".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ne]
  
  inline def ni: typings.elasticElasticsearch.elasticElasticsearchStrings.ni = "ni".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ni]
  
  inline def nn: typings.elasticElasticsearch.elasticElasticsearchStrings.nn = "nn".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nn]
  
  inline def nodeAddress: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeAddress = "nodeAddress".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeAddress]
  
  inline def nodeDotaddress: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotaddress = "node.address".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotaddress]
  
  inline def nodeDotephemeral_id: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotephemeral_id = "node.ephemeral_id".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotephemeral_id]
  
  inline def nodeDotid: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotid = "node.id".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotid]
  
  inline def nodeDotname: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotname = "node.name".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeDotname]
  
  inline def nodeEphemeralId: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeEphemeralId = "nodeEphemeralId".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeEphemeralId]
  
  inline def nodeId: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeId = "nodeId".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeId]
  
  inline def nodeName: typings.elasticElasticsearch.elasticElasticsearchStrings.nodeName = "nodeName".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.nodeName]
  
  inline def opened_time: typings.elasticElasticsearch.elasticElasticsearchStrings.opened_time = "opened_time".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.opened_time]
  
  inline def ot: typings.elasticElasticsearch.elasticElasticsearchStrings.ot = "ot".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.ot]
  
  inline def s: typings.elasticElasticsearch.elasticElasticsearchStrings.s = "s".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.s]
  
  inline def state: typings.elasticElasticsearch.elasticElasticsearchStrings.state = "state".asInstanceOf[typings.elasticElasticsearch.elasticElasticsearchStrings.state]
}
