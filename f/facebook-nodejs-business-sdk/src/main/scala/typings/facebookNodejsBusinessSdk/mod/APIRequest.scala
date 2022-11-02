package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable3
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcApiRequestMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "APIRequest")
@js.native
open class APIRequest protected () extends default {
  def this(nodeId: String, method: String, endpoint: String) = this()
}
object APIRequest {
  
  inline def apply: Instantiable3[/* nodeId */ String, /* method */ String, /* endpoint */ String, default] = ^.asInstanceOf[js.Dynamic].selectDynamic("APIRequest").asInstanceOf[Instantiable3[/* nodeId */ String, /* method */ String, /* endpoint */ String, default]]
}
