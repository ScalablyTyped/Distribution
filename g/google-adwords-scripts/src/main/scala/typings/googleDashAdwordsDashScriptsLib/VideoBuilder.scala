package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoBuilder[Media] extends AdWordsBuilder[Media] {
  def withYouTubeVideoId(youTubeVideoId: java.lang.String): VideoBuilder[Media]
}

object VideoBuilder {
  @scala.inline
  def apply[Media](
    build: js.Function0[AdWordsOperation[Media]],
    withYouTubeVideoId: js.Function1[java.lang.String, VideoBuilder[Media]]
  ): VideoBuilder[Media] = {
    val __obj = js.Dynamic.literal(build = build, withYouTubeVideoId = withYouTubeVideoId)
  
    __obj.asInstanceOf[VideoBuilder[Media]]
  }
}

