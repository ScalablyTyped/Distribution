package typings.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the retry policy in case of function&#39;s execution failure. A
  * function execution will be retried on any failure. A failed execution will
  * be retried up to 7 days with an exponential backoff (capped at 10 seconds).
  * Retried execution is charged as any other execution.
  */
trait SchemaRetry extends StObject
