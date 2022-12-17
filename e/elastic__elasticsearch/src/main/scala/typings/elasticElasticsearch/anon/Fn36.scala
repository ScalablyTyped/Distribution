package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesMod.TermsEnumRequest
import typings.elasticElasticsearch.libApiTypesMod.TermsEnumResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fn36 extends StObject {
  
  def apply(params: TermsEnumRequest): js.Promise[TermsEnumResponse] = js.native
  def apply(params: TermsEnumRequest, options: TransportRequestOptions): js.Promise[TermsEnumResponse] = js.native
  def apply(params: TermsEnumRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TermsEnumResponse, Any]] = js.native
  def apply(params: TermsEnumRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[TermsEnumResponse] = js.native
  def apply(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest): js.Promise[TermsEnumResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest,
    options: TransportRequestOptions
  ): js.Promise[TermsEnumResponse] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[TermsEnumResponse, Any]] = js.native
  def apply(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermsEnumRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[TermsEnumResponse] = js.native
}
