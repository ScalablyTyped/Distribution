package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable2
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcApiResponseMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "APIResponse")
@js.native
open class APIResponse protected () extends default {
  def this(response: Record[String, Any]) = this()
  def this(response: Record[String, Any], call: Record[String, Any]) = this()
}
object APIResponse {
  
  inline def apply: Instantiable2[
    /* response */ Record[String, Any], 
    /* call */ js.UndefOr[Record[String, Any]], 
    default
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("APIResponse").asInstanceOf[Instantiable2[
    /* response */ Record[String, Any], 
    /* call */ js.UndefOr[Record[String, Any]], 
    default
  ]]
}
