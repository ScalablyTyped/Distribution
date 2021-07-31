package typings.formol

import org.scalablytyped.runtime.TopLevel
import typings.formol.anon.Dictk
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Error
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("formol", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formol", JSImport.Default)
  @js.native
  val default: ComponentType[FormolProps[js.Any]] = js.native
  
  @JSImport("formol", "Conditional")
  @js.native
  val Conditional: ComponentType[ConditionalProps[js.Any]] = js.native
  
  object ConditionalContext {
    
    @JSImport("formol", "ConditionalContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formol", "ConditionalContext.Consumer")
    @js.native
    def Consumer: js.Any = js.native
    @scala.inline
    def Consumer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("formol", "ConditionalContext.Provider")
    @js.native
    def Provider: js.Any = js.native
    @scala.inline
    def Provider_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def ConditionalContextWrapper(e: Component[js.Any, js.Object, js.Any]): Component[js.Any, js.Object, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalContextWrapper")(e.asInstanceOf[js.Any]).asInstanceOf[Component[js.Any, js.Object, js.Any]]
  
  @JSImport("formol", "Field")
  @js.native
  val Field: ComponentType[FieldProps[js.Any]] = js.native
  
  @JSImport("formol", "FieldSet")
  @js.native
  val FieldSet: ComponentType[FieldSetProps[js.Any]] = js.native
  
  object FormolContext {
    
    @JSImport("formol", "FormolContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formol", "FormolContext.Consumer")
    @js.native
    def Consumer: js.Any = js.native
    @scala.inline
    def Consumer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("formol", "FormolContext.Provider")
    @js.native
    def Provider: js.Any = js.native
    @scala.inline
    def Provider_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def FormolContextWrapper(WrappedComponent: Component[js.Any, js.Object, js.Any]): Component[js.Any, js.Object, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("FormolContextWrapper")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[js.Any, js.Object, js.Any]]
  
  @JSImport("formol", "Inliner")
  @js.native
  val Inliner: ComponentType[js.Object] = js.native
  
  @JSImport("formol", "NoRequestNeeded")
  @js.native
  val NoRequestNeeded: Error = js.native
  
  @JSImport("formol", "SwitchButton")
  @js.native
  val SwitchButton: ComponentType[SwitchButtonProps] = js.native
  
  @scala.inline
  def choicesAdapter(WrappedComponent: Component[js.Any, js.Object, js.Any]): Component[js.Any, js.Object, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("choicesAdapter")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[js.Any, js.Object, js.Any]]
  
  @scala.inline
  def copy(o: js.Any, names: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(o.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def diff(newItem: js.Any, oldItem: js.Any, names: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(newItem.asInstanceOf[js.Any], oldItem.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def emptyStringToNull(v: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyStringToNull")(v.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def fieldPropsAdapter(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldPropsAdapter")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def get(data: js.Any, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def insert(transientItem: js.Any, name: String, value: js.Any, names: js.Array[String]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(transientItem.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isModified(newItem: js.Any, oldItem: js.Any, names: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModified")(newItem.asInstanceOf[js.Any], oldItem.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def memoizedChoices(WrappedComponent: Component[js.Any, js.Object, js.Any]): Component[js.Any, js.Object, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizedChoices")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[js.Any, js.Object, js.Any]]
  
  @scala.inline
  def multipleAdapter(WrappedComponent: Component[js.Any, js.Object, js.Any]): Component[js.Any, js.Object, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleAdapter")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[js.Any, js.Object, js.Any]]
  
  @scala.inline
  def nullishToEmptyString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nullishToEmptyString")().asInstanceOf[String]
  @scala.inline
  def nullishToEmptyString(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nullishToEmptyString")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def set(data: js.Any, key: String, value: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def set(data: js.Any, key: String, value: js.Any, noArray: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], noArray.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def unrest(e: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unrest")(e.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait ConditionalProps[V] extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var readOnly: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.undefined
    
    var show: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.undefined
    
    var value: js.UndefOr[js.Function1[/* v */ V, js.Any]] = js.undefined
  }
  object ConditionalProps {
    
    @scala.inline
    def apply[V](): ConditionalProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalProps[V]]
    }
    
    @scala.inline
    implicit class ConditionalPropsMutableBuilder[Self <: ConditionalProps[?], V] (val x: Self & ConditionalProps[V]) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setReadOnly(value: (js.Function1[/* val */ V, Boolean]) | Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyFunction1(value: /* val */ V => Boolean): Self = StObject.set(x, "readOnly", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setShow(value: (js.Function1[/* val */ V, Boolean]) | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFunction1(value: /* val */ V => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setValue(value: /* v */ V => js.Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FieldProps[V] extends StObject {
    
    var TypeField: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var children: js.UndefOr[js.Any] = js.undefined
    
    var choices: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNameModifiers: js.UndefOr[js.Any] = js.undefined
    
    var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[ReactNode] = js.undefined
    
    var extras: js.UndefOr[ReactNode] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
    
    var handleChange: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.undefined
    
    var handleEntered: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.undefined
    
    var i18n: js.UndefOr[js.Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var modified: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var normalizer: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var register: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* element */ Ref[js.Any], 
          /* validator */ js.Any, 
          /* validityErrors */ js.Any, 
          Unit
        ]
      ] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var unformatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
    
    var unit: js.UndefOr[ReactNode] = js.undefined
    
    var unregister: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
    
    var validator: js.UndefOr[js.Function1[/* v */ V, String]] = js.undefined
    
    var validityErrors: js.UndefOr[js.Any] = js.undefined
    
    var value: js.UndefOr[V] = js.undefined
  }
  object FieldProps {
    
    @scala.inline
    def apply[V](): FieldProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps[V]]
    }
    
    @scala.inline
    implicit class FieldPropsMutableBuilder[Self <: FieldProps[?], V] (val x: Self & FieldProps[V]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChoices(value: js.Array[js.Any]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: js.Any*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameModifiers(value: js.Any): Self = StObject.set(x, "classNameModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameModifiersUndefined: Self = StObject.set(x, "classNameModifiers", js.undefined)
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDangerousRawHTMLLabels(value: Boolean): Self = StObject.set(x, "dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousRawHTMLLabelsUndefined: Self = StObject.set(x, "dangerousRawHTMLLabels", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setExtras(value: ReactNode): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* v */ V => V): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setHandleChange(value: (/* name */ String, /* v */ V) => Unit): Self = StObject.set(x, "handleChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleChangeUndefined: Self = StObject.set(x, "handleChange", js.undefined)
      
      @scala.inline
      def setHandleEntered(value: (/* name */ String, /* v */ V) => Unit): Self = StObject.set(x, "handleEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleEnteredUndefined: Self = StObject.set(x, "handleEntered", js.undefined)
      
      @scala.inline
      def setI18n(value: js.Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNormalizer(value: /* v */ V => V): Self = StObject.set(x, "normalizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRegister(
        value: (/* name */ String, /* element */ Ref[js.Any], /* validator */ js.Any, /* validityErrors */ js.Any) => Unit
      ): Self = StObject.set(x, "register", js.Any.fromFunction4(value))
      
      @scala.inline
      def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeField(value: ComponentType[js.Object]): Self = StObject.set(x, "TypeField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeFieldUndefined: Self = StObject.set(x, "TypeField", js.undefined)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUnformatter(value: /* v */ V => V): Self = StObject.set(x, "unformatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnformatterUndefined: Self = StObject.set(x, "unformatter", js.undefined)
      
      @scala.inline
      def setUnit(value: ReactNode): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setUnregister(value: /* name */ String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
      
      @scala.inline
      def setValidator(value: /* v */ V => String): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      @scala.inline
      def setValidityErrors(value: js.Any): Self = StObject.set(x, "validityErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidityErrorsUndefined: Self = StObject.set(x, "validityErrors", js.undefined)
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FieldSetProps[V] extends StObject {
    
    var choices: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
    
    var elementRef: js.UndefOr[Ref[js.Any]] = js.undefined
    
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[V] = js.undefined
  }
  object FieldSetProps {
    
    @scala.inline
    def apply[V](): FieldSetProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSetProps[V]]
    }
    
    @scala.inline
    implicit class FieldSetPropsMutableBuilder[Self <: FieldSetProps[?], V] (val x: Self & FieldSetProps[V]) extends AnyVal {
      
      @scala.inline
      def setChoices(value: js.Array[js.Any]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: js.Any*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setDangerousRawHTMLLabels(value: Boolean): Self = StObject.set(x, "dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousRawHTMLLabelsUndefined: Self = StObject.set(x, "dangerousRawHTMLLabels", js.undefined)
      
      @scala.inline
      def setElementRef(value: Ref[js.Any]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      @scala.inline
      def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FormolProps[V] extends StObject {
    
    var allowUnmodifiedSubmit: js.UndefOr[js.Any] = js.undefined
    
    var cancelText: js.UndefOr[js.Any] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[js.Any] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var i18n: js.UndefOr[js.Any] = js.undefined
    
    var item: js.UndefOr[V] = js.undefined
    
    var noCancel: js.UndefOr[js.Any] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var submitText: js.UndefOr[js.Any] = js.undefined
    
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    var validator: js.UndefOr[
        js.Function1[
          /* v */ V, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]:? string | null}
      */ typings.formol.formolStrings.FormolProps & TopLevel[js.Any]
        ]
      ] = js.undefined
  }
  object FormolProps {
    
    @scala.inline
    def apply[V](): FormolProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormolProps[V]]
    }
    
    @scala.inline
    implicit class FormolPropsMutableBuilder[Self <: FormolProps[?], V] (val x: Self & FormolProps[V]) extends AnyVal {
      
      @scala.inline
      def setAllowUnmodifiedSubmit(value: js.Any): Self = StObject.set(x, "allowUnmodifiedSubmit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnmodifiedSubmitUndefined: Self = StObject.set(x, "allowUnmodifiedSubmit", js.undefined)
      
      @scala.inline
      def setCancelText(value: js.Any): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: js.Any): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setI18n(value: js.Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      @scala.inline
      def setItem(value: V): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      @scala.inline
      def setNoCancel(value: js.Any): Self = StObject.set(x, "noCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCancelUndefined: Self = StObject.set(x, "noCancel", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: /* e */ Event => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setSubmitText(value: js.Any): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
      
      @scala.inline
      def setValidator(
        value: /* v */ V => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ K in keyof V ]:? string | null}
        */ typings.formol.formolStrings.FormolProps & TopLevel[js.Any]
      ): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  trait SwitchButtonProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var i18n: js.UndefOr[Dictk] = js.undefined
    
    var leftLabel: js.UndefOr[ReactNode] = js.undefined
    
    var rightLabel: js.UndefOr[ReactNode] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SwitchButtonProps {
    
    @scala.inline
    def apply(): SwitchButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchButtonProps]
    }
    
    @scala.inline
    implicit class SwitchButtonPropsMutableBuilder[Self <: SwitchButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setI18n(value: Dictk): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      @scala.inline
      def setLeftLabel(value: ReactNode): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      @scala.inline
      def setRightLabel(value: ReactNode): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
