package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainQueryStage extends StObject {
  
  var completedParallelInputs: js.UndefOr[String] = js.undefined
  
  var computeMsAvg: js.UndefOr[String] = js.undefined
  
  var computeMsMax: js.UndefOr[String] = js.undefined
  
  var computeRatioAvg: js.UndefOr[Double] = js.undefined
  
  var computeRatioMax: js.UndefOr[Double] = js.undefined
  
  var endMs: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var inputStages: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var parallelInputs: js.UndefOr[String] = js.undefined
  
  var readMsAvg: js.UndefOr[String] = js.undefined
  
  var readMsMax: js.UndefOr[String] = js.undefined
  
  var readRatioAvg: js.UndefOr[Double] = js.undefined
  
  var readRatioMax: js.UndefOr[Double] = js.undefined
  
  var recordsRead: js.UndefOr[String] = js.undefined
  
  var recordsWritten: js.UndefOr[String] = js.undefined
  
  var shuffleOutputBytes: js.UndefOr[String] = js.undefined
  
  var shuffleOutputBytesSpilled: js.UndefOr[String] = js.undefined
  
  var startMs: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[String] = js.undefined
  
  var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.undefined
  
  var waitMsAvg: js.UndefOr[String] = js.undefined
  
  var waitMsMax: js.UndefOr[String] = js.undefined
  
  var waitRatioAvg: js.UndefOr[Double] = js.undefined
  
  var waitRatioMax: js.UndefOr[Double] = js.undefined
  
  var writeMsAvg: js.UndefOr[String] = js.undefined
  
  var writeMsMax: js.UndefOr[String] = js.undefined
  
  var writeRatioAvg: js.UndefOr[Double] = js.undefined
  
  var writeRatioMax: js.UndefOr[Double] = js.undefined
}
object ExplainQueryStage {
  
  inline def apply(): ExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainQueryStage]
  }
  
  extension [Self <: ExplainQueryStage](x: Self) {
    
    inline def setCompletedParallelInputs(value: String): Self = StObject.set(x, "completedParallelInputs", value.asInstanceOf[js.Any])
    
    inline def setCompletedParallelInputsUndefined: Self = StObject.set(x, "completedParallelInputs", js.undefined)
    
    inline def setComputeMsAvg(value: String): Self = StObject.set(x, "computeMsAvg", value.asInstanceOf[js.Any])
    
    inline def setComputeMsAvgUndefined: Self = StObject.set(x, "computeMsAvg", js.undefined)
    
    inline def setComputeMsMax(value: String): Self = StObject.set(x, "computeMsMax", value.asInstanceOf[js.Any])
    
    inline def setComputeMsMaxUndefined: Self = StObject.set(x, "computeMsMax", js.undefined)
    
    inline def setComputeRatioAvg(value: Double): Self = StObject.set(x, "computeRatioAvg", value.asInstanceOf[js.Any])
    
    inline def setComputeRatioAvgUndefined: Self = StObject.set(x, "computeRatioAvg", js.undefined)
    
    inline def setComputeRatioMax(value: Double): Self = StObject.set(x, "computeRatioMax", value.asInstanceOf[js.Any])
    
    inline def setComputeRatioMaxUndefined: Self = StObject.set(x, "computeRatioMax", js.undefined)
    
    inline def setEndMs(value: String): Self = StObject.set(x, "endMs", value.asInstanceOf[js.Any])
    
    inline def setEndMsUndefined: Self = StObject.set(x, "endMs", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInputStages(value: js.Array[String]): Self = StObject.set(x, "inputStages", value.asInstanceOf[js.Any])
    
    inline def setInputStagesUndefined: Self = StObject.set(x, "inputStages", js.undefined)
    
    inline def setInputStagesVarargs(value: String*): Self = StObject.set(x, "inputStages", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParallelInputs(value: String): Self = StObject.set(x, "parallelInputs", value.asInstanceOf[js.Any])
    
    inline def setParallelInputsUndefined: Self = StObject.set(x, "parallelInputs", js.undefined)
    
    inline def setReadMsAvg(value: String): Self = StObject.set(x, "readMsAvg", value.asInstanceOf[js.Any])
    
    inline def setReadMsAvgUndefined: Self = StObject.set(x, "readMsAvg", js.undefined)
    
    inline def setReadMsMax(value: String): Self = StObject.set(x, "readMsMax", value.asInstanceOf[js.Any])
    
    inline def setReadMsMaxUndefined: Self = StObject.set(x, "readMsMax", js.undefined)
    
    inline def setReadRatioAvg(value: Double): Self = StObject.set(x, "readRatioAvg", value.asInstanceOf[js.Any])
    
    inline def setReadRatioAvgUndefined: Self = StObject.set(x, "readRatioAvg", js.undefined)
    
    inline def setReadRatioMax(value: Double): Self = StObject.set(x, "readRatioMax", value.asInstanceOf[js.Any])
    
    inline def setReadRatioMaxUndefined: Self = StObject.set(x, "readRatioMax", js.undefined)
    
    inline def setRecordsRead(value: String): Self = StObject.set(x, "recordsRead", value.asInstanceOf[js.Any])
    
    inline def setRecordsReadUndefined: Self = StObject.set(x, "recordsRead", js.undefined)
    
    inline def setRecordsWritten(value: String): Self = StObject.set(x, "recordsWritten", value.asInstanceOf[js.Any])
    
    inline def setRecordsWrittenUndefined: Self = StObject.set(x, "recordsWritten", js.undefined)
    
    inline def setShuffleOutputBytes(value: String): Self = StObject.set(x, "shuffleOutputBytes", value.asInstanceOf[js.Any])
    
    inline def setShuffleOutputBytesSpilled(value: String): Self = StObject.set(x, "shuffleOutputBytesSpilled", value.asInstanceOf[js.Any])
    
    inline def setShuffleOutputBytesSpilledUndefined: Self = StObject.set(x, "shuffleOutputBytesSpilled", js.undefined)
    
    inline def setShuffleOutputBytesUndefined: Self = StObject.set(x, "shuffleOutputBytes", js.undefined)
    
    inline def setStartMs(value: String): Self = StObject.set(x, "startMs", value.asInstanceOf[js.Any])
    
    inline def setStartMsUndefined: Self = StObject.set(x, "startMs", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSteps(value: js.Array[ExplainQueryStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: ExplainQueryStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    inline def setWaitMsAvg(value: String): Self = StObject.set(x, "waitMsAvg", value.asInstanceOf[js.Any])
    
    inline def setWaitMsAvgUndefined: Self = StObject.set(x, "waitMsAvg", js.undefined)
    
    inline def setWaitMsMax(value: String): Self = StObject.set(x, "waitMsMax", value.asInstanceOf[js.Any])
    
    inline def setWaitMsMaxUndefined: Self = StObject.set(x, "waitMsMax", js.undefined)
    
    inline def setWaitRatioAvg(value: Double): Self = StObject.set(x, "waitRatioAvg", value.asInstanceOf[js.Any])
    
    inline def setWaitRatioAvgUndefined: Self = StObject.set(x, "waitRatioAvg", js.undefined)
    
    inline def setWaitRatioMax(value: Double): Self = StObject.set(x, "waitRatioMax", value.asInstanceOf[js.Any])
    
    inline def setWaitRatioMaxUndefined: Self = StObject.set(x, "waitRatioMax", js.undefined)
    
    inline def setWriteMsAvg(value: String): Self = StObject.set(x, "writeMsAvg", value.asInstanceOf[js.Any])
    
    inline def setWriteMsAvgUndefined: Self = StObject.set(x, "writeMsAvg", js.undefined)
    
    inline def setWriteMsMax(value: String): Self = StObject.set(x, "writeMsMax", value.asInstanceOf[js.Any])
    
    inline def setWriteMsMaxUndefined: Self = StObject.set(x, "writeMsMax", js.undefined)
    
    inline def setWriteRatioAvg(value: Double): Self = StObject.set(x, "writeRatioAvg", value.asInstanceOf[js.Any])
    
    inline def setWriteRatioAvgUndefined: Self = StObject.set(x, "writeRatioAvg", js.undefined)
    
    inline def setWriteRatioMax(value: Double): Self = StObject.set(x, "writeRatioMax", value.asInstanceOf[js.Any])
    
    inline def setWriteRatioMaxUndefined: Self = StObject.set(x, "writeRatioMax", js.undefined)
  }
}
