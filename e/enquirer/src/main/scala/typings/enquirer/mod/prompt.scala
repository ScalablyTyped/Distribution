package typings.enquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enquirer", "prompt")
@js.native
object prompt extends js.Object {
  def apply[T](
    questions: js.Array[
      PromptOptions | (js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions])
    ]
  ): js.Promise[T] = js.native
  def apply[T](questions: js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions]): js.Promise[T] = js.native
  def apply[T](questions: PromptOptions): js.Promise[T] = js.native
}

