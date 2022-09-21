package typings.enquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.enquirer.enquirerStrings.autocomplete
import typings.enquirer.enquirerStrings.confirm
import typings.enquirer.enquirerStrings.editable
import typings.enquirer.enquirerStrings.form
import typings.enquirer.enquirerStrings.input
import typings.enquirer.enquirerStrings.invisible
import typings.enquirer.enquirerStrings.left
import typings.enquirer.enquirerStrings.list
import typings.enquirer.enquirerStrings.multiselect
import typings.enquirer.enquirerStrings.numeral
import typings.enquirer.enquirerStrings.password
import typings.enquirer.enquirerStrings.right
import typings.enquirer.enquirerStrings.scale
import typings.enquirer.enquirerStrings.select
import typings.enquirer.enquirerStrings.snippet
import typings.enquirer.enquirerStrings.sort
import typings.enquirer.enquirerStrings.survey
import typings.enquirer.enquirerStrings.text
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enquirer", JSImport.Namespace)
  @js.native
  open class ^[T] () extends Enquirer[T] {
    def this(options: js.Object) = this()
    def this(options: js.Object, answers: T) = this()
    def this(options: Unit, answers: T) = this()
  }
  @JSImport("enquirer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("enquirer", "Prompt")
  @js.native
  open class Prompt_ () extends BasePrompt
  
  inline def prompt[T](
    questions: js.Array[
      PromptOptions | (js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions])
    ]
  ): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(questions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def prompt[T](questions: js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(questions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def prompt[T](questions: PromptOptions): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(questions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ trait ArrayPromptOptions
    extends StObject
       with BasePromptOptions {
    
    var align: js.UndefOr[left | right] = js.undefined
    
    var choices: js.Array[Choice | String]
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var edgeLength: js.UndefOr[Double] = js.undefined
    
    @JSName("initial")
    var initial_ArrayPromptOptions: js.UndefOr[Double] = js.undefined
    
    var linebreak: js.UndefOr[Boolean] = js.undefined
    
    var maxChoices: js.UndefOr[Double] = js.undefined
    
    var muliple: js.UndefOr[Boolean] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    var separator: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_ArrayPromptOptions: autocomplete | editable | form | multiselect | select | survey | list | scale
  }
  object ArrayPromptOptions {
    
    inline def apply(
      choices: js.Array[Choice | String],
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
    ): ArrayPromptOptions = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayPromptOptions]
    }
    
    extension [Self <: ArrayPromptOptions](x: Self) {
      
      inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChoices(value: js.Array[Choice | String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesVarargs(value: (Choice | String)*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setEdgeLength(value: Double): Self = StObject.set(x, "edgeLength", value.asInstanceOf[js.Any])
      
      inline def setEdgeLengthUndefined: Self = StObject.set(x, "edgeLength", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setLinebreak(value: Boolean): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
      
      inline def setLinebreakUndefined: Self = StObject.set(x, "linebreak", js.undefined)
      
      inline def setMaxChoices(value: Double): Self = StObject.set(x, "maxChoices", value.asInstanceOf[js.Any])
      
      inline def setMaxChoicesUndefined: Self = StObject.set(x, "maxChoices", js.undefined)
      
      inline def setMuliple(value: Boolean): Self = StObject.set(x, "muliple", value.asInstanceOf[js.Any])
      
      inline def setMulipleUndefined: Self = StObject.set(x, "muliple", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setType(value: autocomplete | editable | form | multiselect | select | survey | list | scale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BasePrompt extends EventEmitter {
    
    def render(): Unit = js.native
    
    def run(): js.Promise[Any] = js.native
  }
  
  trait BasePromptOptions
    extends StObject
       with PromptOptions {
    
    var format: js.UndefOr[js.Function1[/* value */ String, String | js.Promise[String]]] = js.undefined
    
    var initial: js.UndefOr[Any] = js.undefined
    
    var message: String | (js.Function0[js.Promise[String] | String])
    
    var name: String | js.Function0[String]
    
    var onCancel: js.UndefOr[
        js.Function3[
          /* name */ String, 
          /* value */ Any, 
          /* prompt */ Prompt_, 
          Boolean | js.Promise[Boolean]
        ]
      ] = js.undefined
    
    var onSubmit: js.UndefOr[
        js.Function3[
          /* name */ String, 
          /* value */ Any, 
          /* prompt */ Prompt_, 
          Boolean | js.Promise[Boolean]
        ]
      ] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var result: js.UndefOr[js.Function1[/* value */ String, String | js.Promise[String]]] = js.undefined
    
    var skip: js.UndefOr[(js.Function1[/* state */ js.Object, Boolean | js.Promise[Boolean]]) | Boolean] = js.undefined
    
    var stdin: js.UndefOr[ReadStream] = js.undefined
    
    var stdout: js.UndefOr[WriteStream] = js.undefined
    
    var `type`: String | js.Function0[String]
    
    var validate: js.UndefOr[
        js.Function1[/* value */ String, Boolean | (js.Promise[Boolean | String]) | String]
      ] = js.undefined
  }
  object BasePromptOptions {
    
    inline def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: String | js.Function0[String]
    ): BasePromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePromptOptions]
    }
    
    extension [Self <: BasePromptOptions](x: Self) {
      
      inline def setFormat(value: /* value */ String => String | js.Promise[String]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInitial(value: Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setMessage(value: String | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      inline def setName(value: String | js.Function0[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameFunction0(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      inline def setOnCancel(value: (/* name */ String, /* value */ Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "onCancel", js.Any.fromFunction3(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnSubmit(value: (/* name */ String, /* value */ Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setResult(value: /* value */ String => String | js.Promise[String]): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setSkip(value: (js.Function1[/* state */ js.Object, Boolean | js.Promise[Boolean]]) | Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setSkipFunction1(value: /* state */ js.Object => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      inline def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      inline def setType(value: String | js.Function0[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction0(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      inline def setValidate(value: /* value */ String => Boolean | (js.Promise[Boolean | String]) | String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ trait BooleanPromptOptions
    extends StObject
       with BasePromptOptions {
    
    @JSName("initial")
    var initial_BooleanPromptOptions: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_BooleanPromptOptions: confirm
  }
  object BooleanPromptOptions {
    
    inline def apply(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): BooleanPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("confirm")
      __obj.asInstanceOf[BooleanPromptOptions]
    }
    
    extension [Self <: BooleanPromptOptions](x: Self) {
      
      inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setType(value: confirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Choice extends StObject {
    
    var disabled: js.UndefOr[Boolean | String] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Choice {
    
    inline def apply(name: String): Choice = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    extension [Self <: Choice](x: Self) {
      
      inline def setDisabled(value: Boolean | String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
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
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ trait NumberPromptOptions
    extends StObject
       with BasePromptOptions {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var float: js.UndefOr[Boolean] = js.undefined
    
    @JSName("initial")
    var initial_NumberPromptOptions: js.UndefOr[Double] = js.undefined
    
    var major: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var minor: js.UndefOr[Double] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_NumberPromptOptions: numeral
  }
  object NumberPromptOptions {
    
    inline def apply(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): NumberPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("numeral")
      __obj.asInstanceOf[NumberPromptOptions]
    }
    
    extension [Self <: NumberPromptOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setType(value: numeral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.enquirer.mod.BasePromptOptions
    - typings.enquirer.mod.ArrayPromptOptions
    - typings.enquirer.mod.BooleanPromptOptions
    - typings.enquirer.mod.StringPromptOptions
    - typings.enquirer.mod.NumberPromptOptions
    - typings.enquirer.mod.SnippetPromptOptions
    - typings.enquirer.mod.SortPromptOptions
  */
  trait PromptOptions extends StObject
  object PromptOptions {
    
    inline def ArrayPromptOptions(
      choices: js.Array[Choice | String],
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
    ): typings.enquirer.mod.ArrayPromptOptions = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.ArrayPromptOptions]
    }
    
    inline def BasePromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: String | js.Function0[String]
    ): typings.enquirer.mod.BasePromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.BasePromptOptions]
    }
    
    inline def BooleanPromptOptions(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): typings.enquirer.mod.BooleanPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("confirm")
      __obj.asInstanceOf[typings.enquirer.mod.BooleanPromptOptions]
    }
    
    inline def NumberPromptOptions(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): typings.enquirer.mod.NumberPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("numeral")
      __obj.asInstanceOf[typings.enquirer.mod.NumberPromptOptions]
    }
    
    inline def SnippetPromptOptions(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): typings.enquirer.mod.SnippetPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("snippet")
      __obj.asInstanceOf[typings.enquirer.mod.SnippetPromptOptions]
    }
    
    inline def SortPromptOptions(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): typings.enquirer.mod.SortPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sort")
      __obj.asInstanceOf[typings.enquirer.mod.SortPromptOptions]
    }
    
    inline def StringPromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: input | invisible | list | password | text
    ): typings.enquirer.mod.StringPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.StringPromptOptions]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ trait SnippetPromptOptions
    extends StObject
       with BasePromptOptions {
    
    var newline: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    @JSName("type")
    var type_SnippetPromptOptions: snippet
  }
  object SnippetPromptOptions {
    
    inline def apply(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): SnippetPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("snippet")
      __obj.asInstanceOf[SnippetPromptOptions]
    }
    
    extension [Self <: SnippetPromptOptions](x: Self) {
      
      inline def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setType(value: snippet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ trait SortPromptOptions
    extends StObject
       with BasePromptOptions {
    
    var drag: js.UndefOr[Boolean] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var numbered: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_SortPromptOptions: sort
  }
  object SortPromptOptions {
    
    inline def apply(message: String | (js.Function0[js.Promise[String] | String]), name: String | js.Function0[String]): SortPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sort")
      __obj.asInstanceOf[SortPromptOptions]
    }
    
    extension [Self <: SortPromptOptions](x: Self) {
      
      inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setNumbered(value: Boolean): Self = StObject.set(x, "numbered", value.asInstanceOf[js.Any])
      
      inline def setNumberedUndefined: Self = StObject.set(x, "numbered", js.undefined)
      
      inline def setType(value: sort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ trait StringPromptOptions
    extends StObject
       with BasePromptOptions {
    
    @JSName("initial")
    var initial_StringPromptOptions: js.UndefOr[String] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    @JSName("type")
    var type_StringPromptOptions: input | invisible | list | password | text
  }
  object StringPromptOptions {
    
    inline def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: input | invisible | list | password | text
    ): StringPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringPromptOptions]
    }
    
    extension [Self <: StringPromptOptions](x: Self) {
      
      inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setType(value: input | invisible | list | password | text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
