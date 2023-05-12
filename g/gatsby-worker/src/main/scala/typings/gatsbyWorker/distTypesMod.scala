package typings.gatsbyWorker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
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
  
  type Counter = Double
  
  type CustomMessage = js.Tuple3[/* 4 */ Double, Counter, Any]
  
  type EndMessage = js.Tuple2[/* 0 */ Double, Counter]
  
  type ErrorMessage = String
  
  type ErrorStack = String
  
  type ErrorType = String
  
  type ExecuteMessage = js.Tuple4[/* 1 */ Double, Counter, FunctionName, FunctionArgs]
  
  type FunctionArgs = js.Array[Any]
  
  type FunctionName = String | Double | js.Symbol
  
  type ParentMessageUnion = ExecuteMessage | EndMessage | CustomMessage
  
  type ResultType = Any
  
  type TaskError = js.Tuple6[/* 2 */ Double, Counter, ErrorType, ErrorMessage, js.UndefOr[ErrorStack], js.Error]
  
  type TaskResult = js.Tuple3[/* 3 */ Double, Counter, ResultType]
  
  type WorkerReadyMessage = js.Tuple2[/* 8 */ Double, Counter]
}
