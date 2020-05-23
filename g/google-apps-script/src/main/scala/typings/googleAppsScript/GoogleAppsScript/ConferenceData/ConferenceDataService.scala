package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service that scripts can use to create conferencing information.
  */
trait ConferenceDataService extends js.Object {
  var ConferenceErrorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any
  var EntryPointFeature: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any
  var EntryPointType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any
  /**
    * Returns a new, empty ConferenceDataBuilder.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceDataBuilder()
    */
  def newConferenceDataBuilder(): ConferenceDataBuilder
  /**
    * Returns a new, empty ConferenceError.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceError()
    */
  def newConferenceError(): ConferenceError
  /**
    * Returns a new, empty ConferenceParameter.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceParameter()
    */
  def newConferenceParameter(): ConferenceParameter
  /**
    * Returns a new, empty EntryPoint.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newEntryPoint()
    */
  def newEntryPoint(): EntryPoint
}

object ConferenceDataService {
  @scala.inline
  def apply(
    ConferenceErrorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any,
    EntryPointFeature: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any,
    EntryPointType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any,
    newConferenceDataBuilder: () => ConferenceDataBuilder,
    newConferenceError: () => ConferenceError,
    newConferenceParameter: () => ConferenceParameter,
    newEntryPoint: () => EntryPoint
  ): ConferenceDataService = {
    val __obj = js.Dynamic.literal(ConferenceErrorType = ConferenceErrorType.asInstanceOf[js.Any], EntryPointFeature = EntryPointFeature.asInstanceOf[js.Any], EntryPointType = EntryPointType.asInstanceOf[js.Any], newConferenceDataBuilder = js.Any.fromFunction0(newConferenceDataBuilder), newConferenceError = js.Any.fromFunction0(newConferenceError), newConferenceParameter = js.Any.fromFunction0(newConferenceParameter), newEntryPoint = js.Any.fromFunction0(newEntryPoint))
    __obj.asInstanceOf[ConferenceDataService]
  }
}

