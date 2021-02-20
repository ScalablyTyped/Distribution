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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enquirer", JSImport.Namespace)
  @js.native
  class ^[T] () extends Enquirer[T] {
    def this(options: js.Object) = this()
    def this(options: js.UndefOr[scala.Nothing], answers: T) = this()
    def this(options: js.Object, answers: T) = this()
  }
  
  @JSImport("enquirer", "Prompt")
  @js.native
  class Prompt_ () extends BasePrompt
  
  @JSImport("enquirer", "prompt")
  @js.native
  def prompt[T](
    questions: js.Array[
      PromptOptions | (js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions])
    ]
  ): js.Promise[T] = js.native
  @JSImport("enquirer", "prompt")
  @js.native
  def prompt[T](questions: js.ThisFunction0[/* this */ Enquirer[js.Object], PromptOptions]): js.Promise[T] = js.native
  @JSImport("enquirer", "prompt")
  @js.native
  def prompt[T](questions: PromptOptions): js.Promise[T] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
  trait ArrayPromptOptions extends BasePromptOptions {
    
    var align: js.UndefOr[left | right] = js.native
    
    var choices: js.Array[Choice | String] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var edgeLength: js.UndefOr[Double] = js.native
    
    @JSName("initial")
    var initial_ArrayPromptOptions: js.UndefOr[Double] = js.native
    
    var linebreak: js.UndefOr[Boolean] = js.native
    
    var maxChoices: js.UndefOr[Double] = js.native
    
    var muliple: js.UndefOr[Boolean] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[Boolean] = js.native
    
    var sort: js.UndefOr[Boolean] = js.native
    
    @JSName("type")
    var type_ArrayPromptOptions: autocomplete | editable | form | multiselect | select | survey | list | scale = js.native
  }
  object ArrayPromptOptions {
    
    @scala.inline
    def apply(
      choices: js.Array[Choice | String],
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
    ): ArrayPromptOptions = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayPromptOptions]
    }
    
    @scala.inline
    implicit class ArrayPromptOptionsMutableBuilder[Self <: ArrayPromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setChoices(value: js.Array[Choice | String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesVarargs(value: (Choice | String)*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setEdgeLength(value: Double): Self = StObject.set(x, "edgeLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeLengthUndefined: Self = StObject.set(x, "edgeLength", js.undefined)
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setLinebreak(value: Boolean): Self = StObject.set(x, "linebreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinebreakUndefined: Self = StObject.set(x, "linebreak", js.undefined)
      
      @scala.inline
      def setMaxChoices(value: Double): Self = StObject.set(x, "maxChoices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChoicesUndefined: Self = StObject.set(x, "maxChoices", js.undefined)
      
      @scala.inline
      def setMuliple(value: Boolean): Self = StObject.set(x, "muliple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulipleUndefined: Self = StObject.set(x, "muliple", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setType(value: autocomplete | editable | form | multiselect | select | survey | list | scale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BasePrompt extends EventEmitter {
    
    def render(): Unit = js.native
    
    def run(): js.Promise[_] = js.native
  }
  
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
    implicit class BasePromptOptionsMutableBuilder[Self <: BasePromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: /* value */ String => String | js.Promise[String]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setInitial(value: js.Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setMessage(value: String | (js.Function0[js.Promise[String] | String])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFunction0(value: () => js.Promise[String] | String): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String | js.Function0[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameFunction0(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancel(
        value: (/* name */ String, /* value */ js.Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnSubmit(
        value: (/* name */ String, /* value */ js.Any, /* prompt */ Prompt_) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResult(value: /* value */ String => String | js.Promise[String]): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setSkip(value: (js.Function1[/* state */ js.Object, Boolean | js.Promise[Boolean]]) | Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipFunction1(value: /* state */ js.Object => Boolean | js.Promise[Boolean]): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setStdin(value: ReadStream): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdinUndefined: Self = StObject.set(x, "stdin", js.undefined)
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Function0[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFunction0(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidate(value: /* value */ String => Boolean | (js.Promise[Boolean | String]) | String): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
  trait BooleanPromptOptions extends BasePromptOptions {
    
    @JSName("initial")
    var initial_BooleanPromptOptions: js.UndefOr[Boolean] = js.native
    
    @JSName("type")
    var type_BooleanPromptOptions: confirm = js.native
  }
  object BooleanPromptOptions {
    
    @scala.inline
    def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: confirm
    ): BooleanPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BooleanPromptOptions]
    }
    
    @scala.inline
    implicit class BooleanPromptOptionsMutableBuilder[Self <: BooleanPromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setType(value: confirm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Choice extends StObject {
    
    var disabled: js.UndefOr[Boolean | String] = js.native
    
    var hint: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object Choice {
    
    @scala.inline
    def apply(name: String): Choice = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice]
    }
    
    @scala.inline
    implicit class ChoiceMutableBuilder[Self <: Choice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean | String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
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
  - typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
  trait NumberPromptOptions extends BasePromptOptions {
    
    var delay: js.UndefOr[Double] = js.native
    
    var float: js.UndefOr[Boolean] = js.native
    
    @JSName("initial")
    var initial_NumberPromptOptions: js.UndefOr[Double] = js.native
    
    var major: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var minor: js.UndefOr[Double] = js.native
    
    var round: js.UndefOr[Boolean] = js.native
    
    @JSName("type")
    var type_NumberPromptOptions: numeral = js.native
  }
  object NumberPromptOptions {
    
    @scala.inline
    def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: numeral
    ): NumberPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberPromptOptions]
    }
    
    @scala.inline
    implicit class NumberPromptOptionsMutableBuilder[Self <: NumberPromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setType(value: numeral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def ArrayPromptOptions(
      choices: js.Array[Choice | String],
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: autocomplete | editable | form | multiselect | select | survey | list | scale
    ): typings.enquirer.mod.ArrayPromptOptions = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.ArrayPromptOptions]
    }
    
    @scala.inline
    def BasePromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: String | js.Function0[String]
    ): typings.enquirer.mod.BasePromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.BasePromptOptions]
    }
    
    @scala.inline
    def BooleanPromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: confirm
    ): typings.enquirer.mod.BooleanPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.BooleanPromptOptions]
    }
    
    @scala.inline
    def NumberPromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: numeral
    ): typings.enquirer.mod.NumberPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.NumberPromptOptions]
    }
    
    @scala.inline
    def SnippetPromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: snippet
    ): typings.enquirer.mod.SnippetPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.SnippetPromptOptions]
    }
    
    @scala.inline
    def SortPromptOptions(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: sort
    ): typings.enquirer.mod.SortPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.enquirer.mod.SortPromptOptions]
    }
    
    @scala.inline
    def StringPromptOptions(
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
  - typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
  trait SnippetPromptOptions extends BasePromptOptions {
    
    var newline: js.UndefOr[String] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    @JSName("type")
    var type_SnippetPromptOptions: snippet = js.native
  }
  object SnippetPromptOptions {
    
    @scala.inline
    def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: snippet
    ): SnippetPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnippetPromptOptions]
    }
    
    @scala.inline
    implicit class SnippetPromptOptionsMutableBuilder[Self <: SnippetPromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewline(value: String): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setType(value: snippet): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
  trait SortPromptOptions extends BasePromptOptions {
    
    var drag: js.UndefOr[Boolean] = js.native
    
    var hint: js.UndefOr[String] = js.native
    
    var numbered: js.UndefOr[Boolean] = js.native
    
    @JSName("type")
    var type_SortPromptOptions: sort = js.native
  }
  object SortPromptOptions {
    
    @scala.inline
    def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: sort
    ): SortPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortPromptOptions]
    }
    
    @scala.inline
    implicit class SortPromptOptionsMutableBuilder[Self <: SortPromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setNumbered(value: Boolean): Self = StObject.set(x, "numbered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberedUndefined: Self = StObject.set(x, "numbered", js.undefined)
      
      @scala.inline
      def setType(value: sort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.enquirer.mod.PromptOptions because Already inherited */ @js.native
  trait StringPromptOptions extends BasePromptOptions {
    
    @JSName("initial")
    var initial_StringPromptOptions: js.UndefOr[String] = js.native
    
    var multiline: js.UndefOr[Boolean] = js.native
    
    @JSName("type")
    var type_StringPromptOptions: input | invisible | list | password | text = js.native
  }
  object StringPromptOptions {
    
    @scala.inline
    def apply(
      message: String | (js.Function0[js.Promise[String] | String]),
      name: String | js.Function0[String],
      `type`: input | invisible | list | password | text
    ): StringPromptOptions = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringPromptOptions]
    }
    
    @scala.inline
    implicit class StringPromptOptionsMutableBuilder[Self <: StringPromptOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setType(value: input | invisible | list | password | text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
