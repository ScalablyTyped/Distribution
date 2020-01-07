package typings.googleapis.buildSrcApisLanguageV1beta1Mod.language_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/language/v1beta1", "language_v1beta1.Resource$Documents")
@js.native
class Resource$Documents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * language.documents.analyzeEntities
    * @desc Finds named entities (currently proper names and common nouns) in
    * the text along with entity types, salience, mentions for each entity, and
    * other properties.
    * @alias language.documents.analyzeEntities
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeEntities(): GaxiosPromise[Schema$AnalyzeEntitiesResponse] = js.native
  def analyzeEntities(callback: BodyResponseCallback[Schema$AnalyzeEntitiesResponse]): Unit = js.native
  def analyzeEntities(params: ParamsDollarResourceDollarDocumentsDollarAnalyzeentities): GaxiosPromise[Schema$AnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzeentities,
    callback: BodyResponseCallback[Schema$AnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzeentities,
    options: BodyResponseCallback[Schema$AnalyzeEntitiesResponse],
    callback: BodyResponseCallback[Schema$AnalyzeEntitiesResponse]
  ): Unit = js.native
  def analyzeEntities(params: ParamsDollarResourceDollarDocumentsDollarAnalyzeentities, options: MethodOptions): GaxiosPromise[Schema$AnalyzeEntitiesResponse] = js.native
  def analyzeEntities(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzeentities,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnalyzeEntitiesResponse]
  ): Unit = js.native
  /**
    * language.documents.analyzeSentiment
    * @desc Analyzes the sentiment of the provided text.
    * @alias language.documents.analyzeSentiment
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeSentimentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeSentiment(): GaxiosPromise[Schema$AnalyzeSentimentResponse] = js.native
  def analyzeSentiment(callback: BodyResponseCallback[Schema$AnalyzeSentimentResponse]): Unit = js.native
  def analyzeSentiment(params: ParamsDollarResourceDollarDocumentsDollarAnalyzesentiment): GaxiosPromise[Schema$AnalyzeSentimentResponse] = js.native
  def analyzeSentiment(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzesentiment,
    callback: BodyResponseCallback[Schema$AnalyzeSentimentResponse]
  ): Unit = js.native
  def analyzeSentiment(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzesentiment,
    options: BodyResponseCallback[Schema$AnalyzeSentimentResponse],
    callback: BodyResponseCallback[Schema$AnalyzeSentimentResponse]
  ): Unit = js.native
  def analyzeSentiment(params: ParamsDollarResourceDollarDocumentsDollarAnalyzesentiment, options: MethodOptions): GaxiosPromise[Schema$AnalyzeSentimentResponse] = js.native
  def analyzeSentiment(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzesentiment,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnalyzeSentimentResponse]
  ): Unit = js.native
  /**
    * language.documents.analyzeSyntax
    * @desc Analyzes the syntax of the text and provides sentence boundaries
    * and tokenization along with part of speech tags, dependency trees, and
    * other properties.
    * @alias language.documents.analyzeSyntax
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnalyzeSyntaxRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def analyzeSyntax(): GaxiosPromise[Schema$AnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(callback: BodyResponseCallback[Schema$AnalyzeSyntaxResponse]): Unit = js.native
  def analyzeSyntax(params: ParamsDollarResourceDollarDocumentsDollarAnalyzesyntax): GaxiosPromise[Schema$AnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzesyntax,
    callback: BodyResponseCallback[Schema$AnalyzeSyntaxResponse]
  ): Unit = js.native
  def analyzeSyntax(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzesyntax,
    options: BodyResponseCallback[Schema$AnalyzeSyntaxResponse],
    callback: BodyResponseCallback[Schema$AnalyzeSyntaxResponse]
  ): Unit = js.native
  def analyzeSyntax(params: ParamsDollarResourceDollarDocumentsDollarAnalyzesyntax, options: MethodOptions): GaxiosPromise[Schema$AnalyzeSyntaxResponse] = js.native
  def analyzeSyntax(
    params: ParamsDollarResourceDollarDocumentsDollarAnalyzesyntax,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnalyzeSyntaxResponse]
  ): Unit = js.native
  /**
    * language.documents.annotateText
    * @desc A convenience method that provides all the features that
    * analyzeSentiment, analyzeEntities, and analyzeSyntax provide in one call.
    * @alias language.documents.annotateText
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AnnotateTextRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def annotateText(): GaxiosPromise[Schema$AnnotateTextResponse] = js.native
  def annotateText(callback: BodyResponseCallback[Schema$AnnotateTextResponse]): Unit = js.native
  def annotateText(params: ParamsDollarResourceDollarDocumentsDollarAnnotatetext): GaxiosPromise[Schema$AnnotateTextResponse] = js.native
  def annotateText(
    params: ParamsDollarResourceDollarDocumentsDollarAnnotatetext,
    callback: BodyResponseCallback[Schema$AnnotateTextResponse]
  ): Unit = js.native
  def annotateText(
    params: ParamsDollarResourceDollarDocumentsDollarAnnotatetext,
    options: BodyResponseCallback[Schema$AnnotateTextResponse],
    callback: BodyResponseCallback[Schema$AnnotateTextResponse]
  ): Unit = js.native
  def annotateText(params: ParamsDollarResourceDollarDocumentsDollarAnnotatetext, options: MethodOptions): GaxiosPromise[Schema$AnnotateTextResponse] = js.native
  def annotateText(
    params: ParamsDollarResourceDollarDocumentsDollarAnnotatetext,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AnnotateTextResponse]
  ): Unit = js.native
}

