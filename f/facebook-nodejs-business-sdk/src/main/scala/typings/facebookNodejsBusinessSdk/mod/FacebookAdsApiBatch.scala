package typings.facebookNodejsBusinessSdk.mod

import org.scalablytyped.runtime.Instantiable3
import typings.facebookNodejsBusinessSdk.mod.^
import typings.facebookNodejsBusinessSdk.srcApiBatchMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("facebook-nodejs-business-sdk", "FacebookAdsApiBatch")
@js.native
open class FacebookAdsApiBatch protected () extends default {
  def this(api: typings.facebookNodejsBusinessSdk.srcApiMod.default) = this()
  def this(
    api: typings.facebookNodejsBusinessSdk.srcApiMod.default,
    successCallback: js.Function1[/* repeated */ Any, Any]
  ) = this()
  def this(
    api: typings.facebookNodejsBusinessSdk.srcApiMod.default,
    successCallback: js.Function1[/* repeated */ Any, Any],
    failureCallback: js.Function1[/* repeated */ Any, Any]
  ) = this()
  def this(
    api: typings.facebookNodejsBusinessSdk.srcApiMod.default,
    successCallback: Unit,
    failureCallback: js.Function1[/* repeated */ Any, Any]
  ) = this()
}
object FacebookAdsApiBatch {
  
  inline def apply: Instantiable3[
    /* api */ typings.facebookNodejsBusinessSdk.srcApiMod.default, 
    /* successCallback */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], 
    /* failureCallback */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], 
    default
  ] = ^.asInstanceOf[js.Dynamic].selectDynamic("FacebookAdsApiBatch").asInstanceOf[Instantiable3[
    /* api */ typings.facebookNodejsBusinessSdk.srcApiMod.default, 
    /* successCallback */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], 
    /* failureCallback */ js.UndefOr[js.Function1[/* repeated */ Any, Any]], 
    default
  ]]
}
