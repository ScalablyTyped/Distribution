package typings.gatsbyWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("gatsby-worker/dist/types", "CUSTOM_MESSAGE")
  @js.native
  val CUSTOM_MESSAGE: /* 4 */ Double = js.native
  
  @JSImport("gatsby-worker/dist/types", "END")
  @js.native
  val END: /* 0 */ Double = js.native
  
  @JSImport("gatsby-worker/dist/types", "ERROR")
  @js.native
  val ERROR: /* 2 */ Double = js.native
  
  @JSImport("gatsby-worker/dist/types", "EXECUTE")
  @js.native
  val EXECUTE: /* 1 */ Double = js.native
  
  @JSImport("gatsby-worker/dist/types", "RESULT")
  @js.native
  val RESULT: /* 3 */ Double = js.native
  
  @JSImport("gatsby-worker/dist/types", "WORKER_READY")
  @js.native
  val WORKER_READY: /* 8 */ Double = js.native
  
  type ChildMessageUnion = TaskError | TaskResult | CustomMessage | WorkerReadyMessage
  
  type CustomMessage = js.Tuple2[/* 4 */ Double, Any]
  
  type EndMessage = js.Array[/* 0 */ Double]
  
  type ErrorMessage = String
  
  type ErrorStack = String
  
  type ErrorType = String
  
  type ExecuteMessage = js.Tuple3[/* 1 */ Double, FunctionName, FunctionArgs]
  
  type FunctionArgs = js.Array[Any]
  
  type FunctionName = String | Double | js.Symbol
  
  type ParentMessageUnion = ExecuteMessage | EndMessage | CustomMessage
  
  type ResultType = Any
  
  type TaskError = js.Tuple5[/* 2 */ Double, ErrorType, ErrorMessage, js.UndefOr[ErrorStack], js.Error]
  
  type TaskResult = js.Tuple2[/* 3 */ Double, ResultType]
  
  type WorkerReadyMessage = js.Array[/* 8 */ Double]
}
