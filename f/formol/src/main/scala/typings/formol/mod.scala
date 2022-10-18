package typings.formol

import typings.formol.anon.Dictk
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
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
  val default: ComponentType[FormolProps[Any]] = js.native
  
  @JSImport("formol", "Conditional")
  @js.native
  val Conditional: ComponentType[ConditionalProps[Any]] = js.native
  
  object ConditionalContext {
    
    @JSImport("formol", "ConditionalContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formol", "ConditionalContext.Consumer")
    @js.native
    def Consumer: Any = js.native
    inline def Consumer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("formol", "ConditionalContext.Provider")
    @js.native
    def Provider: Any = js.native
    inline def Provider_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
  }
  
  inline def ConditionalContextWrapper(e: Component[Any, js.Object, Any]): Component[Any, js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("ConditionalContextWrapper")(e.asInstanceOf[js.Any]).asInstanceOf[Component[Any, js.Object, Any]]
  
  @JSImport("formol", "Field")
  @js.native
  val Field: ComponentType[FieldProps[Any]] = js.native
  
  @JSImport("formol", "FieldSet")
  @js.native
  val FieldSet: ComponentType[FieldSetProps[Any]] = js.native
  
  object FormolContext {
    
    @JSImport("formol", "FormolContext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("formol", "FormolContext.Consumer")
    @js.native
    def Consumer: Any = js.native
    inline def Consumer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
    
    @JSImport("formol", "FormolContext.Provider")
    @js.native
    def Provider: Any = js.native
    inline def Provider_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Provider")(x.asInstanceOf[js.Any])
  }
  
  inline def FormolContextWrapper(WrappedComponent: Component[Any, js.Object, Any]): Component[Any, js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("FormolContextWrapper")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[Any, js.Object, Any]]
  
  @JSImport("formol", "Inliner")
  @js.native
  val Inliner: ComponentType[InlinerProps] = js.native
  
  @JSImport("formol", "NoRequestNeeded")
  @js.native
  val NoRequestNeeded: js.Error = js.native
  
  @JSImport("formol", "SwitchButton")
  @js.native
  val SwitchButton: ComponentType[SwitchButtonProps] = js.native
  
  inline def choicesAdapter(WrappedComponent: Component[Any, js.Object, Any]): Component[Any, js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("choicesAdapter")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[Any, js.Object, Any]]
  
  inline def copy(o: Any, names: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(o.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def diff(newItem: Any, oldItem: Any, names: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(newItem.asInstanceOf[js.Any], oldItem.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def emptyStringToNull(v: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyStringToNull")(v.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def fieldPropsAdapter(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fieldPropsAdapter")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def get(data: Any, key: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def insert(transientItem: Any, name: String, value: Any, names: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(transientItem.asInstanceOf[js.Any], name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isModified(newItem: Any, oldItem: Any, names: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModified")(newItem.asInstanceOf[js.Any], oldItem.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def memoizedChoices(WrappedComponent: Component[Any, js.Object, Any]): Component[Any, js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizedChoices")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[Any, js.Object, Any]]
  
  inline def multipleAdapter(WrappedComponent: Component[Any, js.Object, Any]): Component[Any, js.Object, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multipleAdapter")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Component[Any, js.Object, Any]]
  
  inline def nullishToEmptyString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nullishToEmptyString")().asInstanceOf[String]
  inline def nullishToEmptyString(v: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nullishToEmptyString")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def set(data: Any, key: String, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def set(data: Any, key: String, value: Any, noArray: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], noArray.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def unrest(e: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unrest")(scala.List(e.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  trait ConditionalProps[V] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var readOnly: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.undefined
    
    var show: js.UndefOr[(js.Function1[/* val */ V, Boolean]) | Boolean] = js.undefined
    
    var value: js.UndefOr[js.Function1[/* v */ V, Any]] = js.undefined
  }
  object ConditionalProps {
    
    inline def apply[V](): ConditionalProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConditionalProps[V]]
    }
    
    extension [Self <: ConditionalProps[?], V](x: Self & ConditionalProps[V]) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setReadOnly(value: (js.Function1[/* val */ V, Boolean]) | Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyFunction1(value: /* val */ V => Boolean): Self = StObject.set(x, "readOnly", js.Any.fromFunction1(value))
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setShow(value: (js.Function1[/* val */ V, Boolean]) | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowFunction1(value: /* val */ V => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setValue(value: /* v */ V => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FieldProps[V] extends StObject {
    
    var TypeField: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var choices: js.UndefOr[js.Array[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classNameModifiers: js.UndefOr[Any] = js.undefined
    
    var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[ReactNode] = js.undefined
    
    var extras: js.UndefOr[ReactNode] = js.undefined
    
    var formatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
    
    var handleChange: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.undefined
    
    var handleEntered: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.undefined
    
    var i18n: js.UndefOr[Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var modified: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var normalizer: js.UndefOr[js.Function1[/* v */ V, V]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var register: js.UndefOr[
        js.Function4[
          /* name */ String, 
          /* element */ Ref[Any], 
          /* validator */ Any, 
          /* validityErrors */ Any, 
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
    
    var validityErrors: js.UndefOr[Any] = js.undefined
    
    var value: js.UndefOr[V] = js.undefined
  }
  object FieldProps {
    
    inline def apply[V](): FieldProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldProps[V]]
    }
    
    extension [Self <: FieldProps[?], V](x: Self & FieldProps[V]) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChoices(value: js.Array[Any]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: Any*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameModifiers(value: Any): Self = StObject.set(x, "classNameModifiers", value.asInstanceOf[js.Any])
      
      inline def setClassNameModifiersUndefined: Self = StObject.set(x, "classNameModifiers", js.undefined)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDangerousRawHTMLLabels(value: Boolean): Self = StObject.set(x, "dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
      
      inline def setDangerousRawHTMLLabelsUndefined: Self = StObject.set(x, "dangerousRawHTMLLabels", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtras(value: ReactNode): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setExtrasUndefined: Self = StObject.set(x, "extras", js.undefined)
      
      inline def setFormatter(value: /* v */ V => V): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHandleChange(value: (/* name */ String, /* v */ V) => Unit): Self = StObject.set(x, "handleChange", js.Any.fromFunction2(value))
      
      inline def setHandleChangeUndefined: Self = StObject.set(x, "handleChange", js.undefined)
      
      inline def setHandleEntered(value: (/* name */ String, /* v */ V) => Unit): Self = StObject.set(x, "handleEntered", js.Any.fromFunction2(value))
      
      inline def setHandleEnteredUndefined: Self = StObject.set(x, "handleEntered", js.undefined)
      
      inline def setI18n(value: Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setModifiedUndefined: Self = StObject.set(x, "modified", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNormalizer(value: /* v */ V => V): Self = StObject.set(x, "normalizer", js.Any.fromFunction1(value))
      
      inline def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRegister(
        value: (/* name */ String, /* element */ Ref[Any], /* validator */ Any, /* validityErrors */ Any) => Unit
      ): Self = StObject.set(x, "register", js.Any.fromFunction4(value))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeField(value: ComponentType[js.Object]): Self = StObject.set(x, "TypeField", value.asInstanceOf[js.Any])
      
      inline def setTypeFieldUndefined: Self = StObject.set(x, "TypeField", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnformatter(value: /* v */ V => V): Self = StObject.set(x, "unformatter", js.Any.fromFunction1(value))
      
      inline def setUnformatterUndefined: Self = StObject.set(x, "unformatter", js.undefined)
      
      inline def setUnit(value: ReactNode): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setUnregister(value: /* name */ String => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
      
      inline def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
      
      inline def setValidator(value: /* v */ V => String): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
      
      inline def setValidityErrors(value: Any): Self = StObject.set(x, "validityErrors", value.asInstanceOf[js.Any])
      
      inline def setValidityErrorsUndefined: Self = StObject.set(x, "validityErrors", js.undefined)
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FieldSetProps[V] extends StObject {
    
    var choices: js.UndefOr[js.Array[Any]] = js.undefined
    
    var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
    
    var elementRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[V] = js.undefined
  }
  object FieldSetProps {
    
    inline def apply[V](): FieldSetProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldSetProps[V]]
    }
    
    extension [Self <: FieldSetProps[?], V](x: Self & FieldSetProps[V]) {
      
      inline def setChoices(value: js.Array[Any]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: Any*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setDangerousRawHTMLLabels(value: Boolean): Self = StObject.set(x, "dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
      
      inline def setDangerousRawHTMLLabelsUndefined: Self = StObject.set(x, "dangerousRawHTMLLabels", js.undefined)
      
      inline def setElementRef(value: Ref[Any]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      inline def setElementRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "elementRef", js.Any.fromFunction1(value))
      
      inline def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FormolProps[V] extends StObject {
    
    var allowUnmodifiedSubmit: js.UndefOr[Any] = js.undefined
    
    var cancelText: js.UndefOr[Any] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[Any] = js.undefined
    
    var extra: js.UndefOr[ReactNode] = js.undefined
    
    var i18n: js.UndefOr[Any] = js.undefined
    
    var item: js.UndefOr[V] = js.undefined
    
    var noCancel: js.UndefOr[Any] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var submitText: js.UndefOr[Any] = js.undefined
    
    var types: js.UndefOr[js.Array[String]] = js.undefined
    
    var validator: js.UndefOr[
        js.Function1[
          /* v */ V, 
          /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]:? string | null} */ js.Any
        ]
      ] = js.undefined
  }
  object FormolProps {
    
    inline def apply[V](): FormolProps[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormolProps[V]]
    }
    
    extension [Self <: FormolProps[?], V](x: Self & FormolProps[V]) {
      
      inline def setAllowUnmodifiedSubmit(value: Any): Self = StObject.set(x, "allowUnmodifiedSubmit", value.asInstanceOf[js.Any])
      
      inline def setAllowUnmodifiedSubmitUndefined: Self = StObject.set(x, "allowUnmodifiedSubmit", js.undefined)
      
      inline def setCancelText(value: Any): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: Any): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setI18n(value: Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setItem(value: V): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setNoCancel(value: Any): Self = StObject.set(x, "noCancel", value.asInstanceOf[js.Any])
      
      inline def setNoCancelUndefined: Self = StObject.set(x, "noCancel", js.undefined)
      
      inline def setOnSubmit(value: /* e */ Event => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setSubmitText(value: Any): Self = StObject.set(x, "submitText", value.asInstanceOf[js.Any])
      
      inline def setSubmitTextUndefined: Self = StObject.set(x, "submitText", js.undefined)
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
      
      inline def setValidator(
        value: /* v */ V => /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof V ]:? string | null} */ js.Any
      ): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  trait InlinerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object InlinerProps {
    
    inline def apply(): InlinerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlinerProps]
    }
    
    extension [Self <: InlinerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
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
    
    inline def apply(): SwitchButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwitchButtonProps]
    }
    
    extension [Self <: SwitchButtonProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setI18n(value: Dictk): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setLeftLabel(value: ReactNode): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      inline def setRightLabel(value: ReactNode): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      inline def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
