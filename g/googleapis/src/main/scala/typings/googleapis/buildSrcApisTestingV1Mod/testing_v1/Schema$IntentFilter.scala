package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The &lt;intent-filter&gt; section of an &lt;activity&gt; tag.
  * https://developer.android.com/guide/topics/manifest/intent-filter-element.html
  */
@js.native
trait Schema$IntentFilter extends js.Object {
  /**
    * The android:name value of the &lt;action&gt; tag.
    */
  var actionNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The android:name value of the &lt;category&gt; tag.
    */
  var categoryNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The android:mimeType value of the &lt;data&gt; tag.
    */
  var mimeType: js.UndefOr[String] = js.native
}

object Schema$IntentFilter {
  @scala.inline
  def apply(
    actionNames: js.Array[String] = null,
    categoryNames: js.Array[String] = null,
    mimeType: String = null
  ): Schema$IntentFilter = {
    val __obj = js.Dynamic.literal()
    if (actionNames != null) __obj.updateDynamic("actionNames")(actionNames.asInstanceOf[js.Any])
    if (categoryNames != null) __obj.updateDynamic("categoryNames")(categoryNames.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IntentFilter]
  }
}

