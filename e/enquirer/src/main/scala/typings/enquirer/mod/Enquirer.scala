package typings.enquirer.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enquirer[T] extends EventEmitter {
  
  def prompt(
    questions: js.Array[
      PromptOptions | (js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions])
    ]
  ): js.Promise[T] = js.native
  def prompt(questions: js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions]): js.Promise[T] = js.native
  /**
    * Prompt function that takes a "question" object or array of question objects,
    * and returns an object with responses from the user.
    *
    * @param questions Options objects for one or more prompts to run.
    */
  def prompt(questions: PromptOptions): js.Promise[T] = js.native
  
  def register(
    `type`: String,
    fn: js.Function0[Instantiable1[/* options */ js.UndefOr[PromptOptions], BasePrompt]]
  ): this.type = js.native
  /**
    * Register a custom prompt type.
    *
    * @param type
    * @param fn `Prompt` class, or a function that returns a `Prompt` class.
    */
  def register(`type`: String, fn: Instantiable1[/* options */ js.UndefOr[PromptOptions], BasePrompt]): this.type = js.native
  /**
    * Register a custom prompt type.
    */
  def register(
    `type`: StringDictionary[
      (Instantiable1[/* options */ js.UndefOr[PromptOptions], BasePrompt]) | (js.Function0[Instantiable1[/* options */ js.UndefOr[PromptOptions], BasePrompt]])
    ]
  ): this.type = js.native
  
  /**
    * Use an enquirer plugin.
    *
    * @param plugin Plugin function that takes an instance of Enquirer.
    */
  def use(plugin: js.ThisFunction1[/* this */ this.type, /* enquirer */ this.type, Unit]): this.type = js.native
}
