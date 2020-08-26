package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistentPreferredActivity extends js.Object {
  /**
    * The intent actions to match in the filter. If any actions are included in the filter, then an intent's action must be one of those values for it to
    * match. If no actions are included, the intent action is ignored.
    */
  var actions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The intent categories to match in the filter. An intent includes the categories that it requires, all of which must be included in the filter in order
    * to match. In other words, adding a category to the filter has no impact on matching unless that category is specified in the intent.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  /**
    * The activity that should be the default intent handler. This should be an Android component name, e.g. com.android.enterprise.app/.MainActivity.
    * Alternatively, the value may be the package name of an app, which causes Android Device Policy to choose an appropriate activity from the app to handle
    * the intent.
    */
  var receiverActivity: js.UndefOr[String] = js.native
}

object PersistentPreferredActivity {
  @scala.inline
  def apply(): PersistentPreferredActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentPreferredActivity]
  }
  @scala.inline
  implicit class PersistentPreferredActivityOps[Self <: PersistentPreferredActivity] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setReceiverActivity(value: String): Self = this.set("receiverActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiverActivity: Self = this.set("receiverActivity", js.undefined)
  }
  
}

