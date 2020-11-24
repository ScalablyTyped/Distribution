package typings.flowjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CatchAllCallbackArguments = js.Array[typings.std.Event]
  
  type CompleteCallbackArguments = js.Array[js.Any]
  
  type ErrorCallbackArguments = js.Tuple3[java.lang.String, typings.flowjs.mod.FlowFile, typings.flowjs.mod.FlowChunk]
  
  type FileAddedCallbackArguments = js.Tuple2[typings.flowjs.mod.FlowFile, typings.std.Event]
  
  type FileErrorCallbackArguments = js.Tuple3[typings.flowjs.mod.FlowFile, java.lang.String, typings.flowjs.mod.FlowChunk]
  
  type FileProgressCallbackArguments = js.Tuple2[typings.flowjs.mod.FlowFile, typings.flowjs.mod.FlowChunk]
  
  type FileRemovedCallbackArguments = js.Array[typings.flowjs.mod.FlowFile]
  
  type FileRetryCallbackArguments = js.Tuple2[typings.flowjs.mod.FlowFile, typings.flowjs.mod.FlowChunk]
  
  type FileSuccessCallbackArguments = js.Tuple3[typings.flowjs.mod.FlowFile, java.lang.String, typings.flowjs.mod.FlowChunk]
  
  type FilesAddedCallbackArguments = js.Tuple2[js.Array[typings.flowjs.mod.FlowFile], typings.std.Event]
  
  type FilesSubmittedCallbackArguments = js.Tuple2[js.Array[typings.flowjs.mod.FlowFile], typings.std.Event]
  
  type FlowEvent = typings.flowjs.mod.CompleteCallbackArguments | typings.flowjs.mod.UploadStartCallbackArguments | typings.flowjs.mod.ProgressCallbackArguments | typings.flowjs.mod.FileSuccessCallbackArguments | typings.flowjs.mod.FilesSubmittedCallbackArguments | typings.flowjs.mod.FileAddedCallbackArguments | typings.flowjs.mod.FileRetryCallbackArguments | typings.flowjs.mod.ErrorCallbackArguments | typings.flowjs.mod.FileRemovedCallbackArguments | typings.flowjs.mod.FileProgressCallbackArguments | typings.flowjs.mod.FileErrorCallbackArguments | typings.flowjs.mod.FilesAddedCallbackArguments | typings.flowjs.mod.CatchAllCallbackArguments
  
  type FlowEventFromEventName[T /* <: typings.flowjs.mod.EventName */] = /* import warning: importer.ImportType#apply Failed type conversion: flowjs.flowjs.FlowEventMap[T] */ js.Any
  
  type FlowEventTypeFromFlowEvent[T /* <: typings.flowjs.mod.FlowEvent */] = js.Any
  
  type ProgressCallbackArguments = js.Array[js.Any]
  
  type UploadStartCallbackArguments = js.Array[js.Any]
}
