package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Service that scripts can use to create conferencing information.
  */
@js.native
trait ConferenceDataService extends js.Object {
  var ConferenceErrorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any = js.native
  var EntryPointFeature: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any = js.native
  var EntryPointType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any = js.native
  /**
    * Returns a new, empty ConferenceDataBuilder.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceDataBuilder()
    */
  def newConferenceDataBuilder(): ConferenceDataBuilder = js.native
  /**
    * Returns a new, empty ConferenceError.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceError()
    */
  def newConferenceError(): ConferenceError = js.native
  /**
    * Returns a new, empty ConferenceParameter.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceParameter()
    */
  def newConferenceParameter(): ConferenceParameter = js.native
  /**
    * Returns a new, empty EntryPoint.
    * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newEntryPoint()
    */
  def newEntryPoint(): EntryPoint = js.native
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
  @scala.inline
  implicit class ConferenceDataServiceOps[Self <: ConferenceDataService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConferenceErrorType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any
    ): Self = this.set("ConferenceErrorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryPointFeature(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any
    ): Self = this.set("EntryPointFeature", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntryPointType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any
    ): Self = this.set("EntryPointType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewConferenceDataBuilder(value: () => ConferenceDataBuilder): Self = this.set("newConferenceDataBuilder", js.Any.fromFunction0(value))
    @scala.inline
    def setNewConferenceError(value: () => ConferenceError): Self = this.set("newConferenceError", js.Any.fromFunction0(value))
    @scala.inline
    def setNewConferenceParameter(value: () => ConferenceParameter): Self = this.set("newConferenceParameter", js.Any.fromFunction0(value))
    @scala.inline
    def setNewEntryPoint(value: () => EntryPoint): Self = this.set("newEntryPoint", js.Any.fromFunction0(value))
  }
  
}

