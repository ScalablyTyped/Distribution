package typings.gapiClientSurveys.gapi.client.surveys

import typings.gapiClient.gapi.client.Request
import typings.gapiClientSurveys.anon.Fields
import typings.gapiClientSurveys.anon.Key
import typings.gapiClientSurveys.anon.Oauthtoken
import typings.gapiClientSurveys.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveysResource extends js.Object {
  /** Removes a survey from view in all user GET requests. */
  def delete(request: Key): Request[SurveysDeleteResponse] = js.native
  /** Retrieves information about the specified survey. */
  def get(request: Key): Request[Survey] = js.native
  /** Creates a survey. */
  def insert(request: Oauthtoken): Request[Survey] = js.native
  /** Lists the surveys owned by the authenticated user. */
  def list(request: Fields): Request[SurveysListResponse] = js.native
  /** Begins running a survey. */
  def start(request: PrettyPrint): Request[SurveysStartResponse] = js.native
  /** Stops a running survey. */
  def stop(request: PrettyPrint): Request[SurveysStopResponse] = js.native
  /** Updates a survey. Currently the only property that can be updated is the owners property. */
  def update(request: Key): Request[Survey] = js.native
}

object SurveysResource {
  @scala.inline
  def apply(
    delete: Key => Request[SurveysDeleteResponse],
    get: Key => Request[Survey],
    insert: Oauthtoken => Request[Survey],
    list: Fields => Request[SurveysListResponse],
    start: PrettyPrint => Request[SurveysStartResponse],
    stop: PrettyPrint => Request[SurveysStopResponse],
    update: Key => Request[Survey]
  ): SurveysResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction1(stop), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[SurveysResource]
  }
  @scala.inline
  implicit class SurveysResourceOps[Self <: SurveysResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Key => Request[SurveysDeleteResponse]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Survey]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: Oauthtoken => Request[Survey]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[SurveysListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: PrettyPrint => Request[SurveysStartResponse]): Self = this.set("start", js.Any.fromFunction1(value))
    @scala.inline
    def setStop(value: PrettyPrint => Request[SurveysStopResponse]): Self = this.set("stop", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Key => Request[Survey]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

