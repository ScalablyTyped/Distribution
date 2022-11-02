package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable2
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcObjectsServersideBatchProcessorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "BatchProcessor")
@js.native
open class BatchProcessor protected () extends default {
  def this(batch_size: Double, concurrent_requests: Double) = this()
}
object BatchProcessor {
  
  inline def apply: Instantiable2[/* batch_size */ Double, /* concurrent_requests */ Double, default] = ^.asInstanceOf[js.Dynamic].selectDynamic("BatchProcessor").asInstanceOf[Instantiable2[/* batch_size */ Double, /* concurrent_requests */ Double, default]]
}
