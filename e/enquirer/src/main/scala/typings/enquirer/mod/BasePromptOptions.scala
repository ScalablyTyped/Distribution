package typings.enquirer.mod

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePromptOptions extends PromptOptions {
  
  var format: js.UndefOr[js.Function1[/* value */ String, String | js.Promise[String]]] = js.native
  
  var initial: js.UndefOr[js.Any] = js.native
  
  var message: String | (js.Function0[js.Promise[String] | String]) = js.native
  
  var name: String | js.Function0[String] = js.native
  
  var onCancel: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* value */ js.Any, 
      /* prompt */ Prompt_, 
      Boolean | js.Promise[Boolean]
    ]
  ] = js.native
  
  var onSubmit: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* value */ js.Any, 
      /* prompt */ Prompt_, 
      Boolean | js.Promise[Boolean]
    ]
  ] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var result: js.UndefOr[js.Function1[/* value */ String, String | js.Promise[String]]] = js.native
  
  var skip: js.UndefOr[(js.Function1[/* state */ js.Object, Boolean | js.Promise[Boolean]]) | Boolean] = js.native
  
  var stdin: js.UndefOr[ReadStream] = js.native
  
  var stdout: js.UndefOr[WriteStream] = js.native
  
  var `type`: String | js.Function0[String] = js.native
  
  var validate: js.UndefOr[
    js.Function1[/* value */ String, Boolean | (js.Promise[Boolean | String]) | String]
  ] = js.native
}
object BasePromptOptions {
  
  @scala.inline
  def apply(
    message: String | (js.Function0[js.Promise[String] | String]),
    name: String | js.Function0[String],
    `type`: String | js.Function0[String]
  ): BasePromptOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePromptOptions]
  }
  
  @scala.inline
  implicit class BasePromptOptionsOps[Self <: BasePromptOptions] (val x: Self) extends AnyVal {
    
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
    def setMessageFunction0(value: () => js.Promise[String] | String): Self = this.set("message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String | (js.Function0[js.Promise[String] | String])): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameFunction0(value: () => String): Self = this.set("name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String | js.Function0[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFunction0(value: () => String): Self = this.set("type", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String | js.Function0[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: /* value */ String => String | js.Promise[String]): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInitial(value: js.Any): Self = this.set("initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitial: Self = this.set("initial", js.undefined)
    
    @scala.inline
    def setOnCancel(
      value: (/* name */ String, /* value */ js.Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]
    ): Self = this.set("onCancel", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnSubmit(
      value: (/* name */ String, /* value */ js.Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]
    ): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setResult(value: /* value */ String => String | js.Promise[String]): Self = this.set("result", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setSkipFunction1(value: /* state */ js.Object => Boolean | js.Promise[Boolean]): Self = this.set("skip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkip(value: (js.Function1[/* state */ js.Object, Boolean | js.Promise[Boolean]]) | Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setStdin(value: ReadStream): Self = this.set("stdin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdin: Self = this.set("stdin", js.undefined)
    
    @scala.inline
    def setStdout(value: WriteStream): Self = this.set("stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStdout: Self = this.set("stdout", js.undefined)
    
    @scala.inline
    def setValidate(value: /* value */ String => Boolean | (js.Promise[Boolean | String]) | String): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
}
