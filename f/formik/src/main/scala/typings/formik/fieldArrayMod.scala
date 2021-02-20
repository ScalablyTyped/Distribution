package typings.formik

import typings.formik.typesMod.FormikProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldArrayMod {
  
  @JSImport("formik/dist/FieldArray", "FieldArray")
  @js.native
  val FieldArray: ComponentType[FieldArrayConfig] = js.native
  
  @JSImport("formik/dist/FieldArray", "insert")
  @js.native
  def insert(arrayLike: ArrayLike[_], index: Double, value: js.Any): js.Array[_] = js.native
  
  @JSImport("formik/dist/FieldArray", "move")
  @js.native
  def move(array: js.Array[_], from: Double, to: Double): js.Array[_] = js.native
  
  @JSImport("formik/dist/FieldArray", "replace")
  @js.native
  def replace(arrayLike: ArrayLike[_], index: Double, value: js.Any): js.Array[_] = js.native
  
  @JSImport("formik/dist/FieldArray", "swap")
  @js.native
  def swap(arrayLike: ArrayLike[_], indexA: Double, indexB: Double): js.Array[_] = js.native
  
  @js.native
  trait ArrayHelpers extends StObject {
    
    /** Curried fn to insert an element at a given index into the array */
    def handleInsert(index: Double, value: js.Any): js.Function0[Unit] = js.native
    
    /** Imperatively move an element in an array to another index */
    def handleMove(from: Double, to: Double): js.Function0[Unit] = js.native
    
    /** Curried fn to remove a value from the end of the array */
    def handlePop(): js.Function0[Unit] = js.native
    
    /** Curried fn to add a value to the end of an array */
    def handlePush(obj: js.Any): js.Function0[Unit] = js.native
    
    /** Curried fn to remove an element at an index of an array */
    def handleRemove(index: Double): js.Function0[Unit] = js.native
    
    /** Curried fn to replace an element at a given index into the array */
    def handleReplace(index: Double, value: js.Any): js.Function0[Unit] = js.native
    
    /** Curried fn to swap two values in an array */
    def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit] = js.native
    
    /** Curried fn to add an element to the beginning of an array */
    def handleUnshift(value: js.Any): js.Function0[Unit] = js.native
    
    /** Imperatively insert an element at a given index into the array */
    def insert(index: Double, value: js.Any): Unit = js.native
    
    /** Imperatively move an element in an array to another index */
    def move(from: Double, to: Double): Unit = js.native
    
    /** Imperatively remove and return value from the end of the array */
    def pop[T](): js.UndefOr[T] = js.native
    
    /** Imperatively add a value to the end of an array */
    def push(obj: js.Any): Unit = js.native
    
    /** Imperatively remove and element at an index of an array */
    def remove[T](index: Double): js.UndefOr[T] = js.native
    
    /** Imperatively replace a value at an index of an array  */
    def replace(index: Double, value: js.Any): Unit = js.native
    
    /** Imperatively swap two values in an array */
    def swap(indexA: Double, indexB: Double): Unit = js.native
    
    /** Imperatively add an element to the beginning of an array and return its length */
    def unshift(value: js.Any): Double = js.native
  }
  object ArrayHelpers {
    
    @scala.inline
    def apply(
      handleInsert: (Double, js.Any) => js.Function0[Unit],
      handleMove: (Double, Double) => js.Function0[Unit],
      handlePop: () => js.Function0[Unit],
      handlePush: js.Any => js.Function0[Unit],
      handleRemove: Double => js.Function0[Unit],
      handleReplace: (Double, js.Any) => js.Function0[Unit],
      handleSwap: (Double, Double) => js.Function0[Unit],
      handleUnshift: js.Any => js.Function0[Unit],
      insert: (Double, js.Any) => Unit,
      move: (Double, Double) => Unit,
      pop: () => js.UndefOr[js.Any],
      push: js.Any => Unit,
      remove: Double => js.UndefOr[js.Any],
      replace: (Double, js.Any) => Unit,
      swap: (Double, Double) => Unit,
      unshift: js.Any => Double
    ): ArrayHelpers = {
      val __obj = js.Dynamic.literal(handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[ArrayHelpers]
    }
    
    @scala.inline
    implicit class ArrayHelpersMutableBuilder[Self <: ArrayHelpers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleInsert(value: (Double, js.Any) => js.Function0[Unit]): Self = StObject.set(x, "handleInsert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleMove(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "handleMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandlePop(value: () => js.Function0[Unit]): Self = StObject.set(x, "handlePop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandlePush(value: js.Any => js.Function0[Unit]): Self = StObject.set(x, "handlePush", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleRemove(value: Double => js.Function0[Unit]): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleReplace(value: (Double, js.Any) => js.Function0[Unit]): Self = StObject.set(x, "handleReplace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleSwap(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "handleSwap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleUnshift(value: js.Any => js.Function0[Unit]): Self = StObject.set(x, "handleUnshift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsert(value: (Double, js.Any) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMove(value: (Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPop(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: js.Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: Double => js.UndefOr[js.Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplace(value: (Double, js.Any) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSwap(value: (Double, Double) => Unit): Self = StObject.set(x, "swap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnshift(value: js.Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined {  name :string,   validateOnChange :boolean | undefined} & formik.formik/dist/types.SharedRenderProps<formik.formik/dist/FieldArray.FieldArrayRenderProps> */
  @js.native
  trait FieldArrayConfig extends StObject {
    
    /**
      * Children render function <Field name>{props => ...}</Field>)
      */
    var children: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, ReactNode]] = js.native
    
    /**
      * Field component to render. Can either be a string like 'select' or a component.
      */
    var component: js.UndefOr[String | (ComponentType[FieldArrayRenderProps | Unit])] = js.native
    
    /** Really the path to the array field to be updated */
    var name: String = js.native
    
    /**
      * Render prop (works like React router's <Route render={props =>} />)
      */
    var render: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, ReactNode]] = js.native
    
    /** Should field array validate the form AFTER array updates/changes? */
    var validateOnChange: js.UndefOr[Boolean] = js.native
  }
  object FieldArrayConfig {
    
    @scala.inline
    def apply(name: String): FieldArrayConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldArrayConfig]
    }
    
    @scala.inline
    implicit class FieldArrayConfigMutableBuilder[Self <: FieldArrayConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: /* props */ FieldArrayRenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setComponent(value: String | (ComponentType[FieldArrayRenderProps | Unit])): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: /* props */ FieldArrayRenderProps => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    }
  }
  
  /* Inlined formik.formik/dist/FieldArray.ArrayHelpers & {  form :formik.formik/dist/types.FormikProps<any>,   name :string} */
  @js.native
  trait FieldArrayRenderProps extends StObject {
    
    var form: FormikProps[_] = js.native
    
    /** Curried fn to insert an element at a given index into the array */
    def handleInsert(index: Double, value: js.Any): js.Function0[Unit] = js.native
    
    /** Imperatively move an element in an array to another index */
    def handleMove(from: Double, to: Double): js.Function0[Unit] = js.native
    
    /** Curried fn to remove a value from the end of the array */
    def handlePop(): js.Function0[Unit] = js.native
    
    /** Curried fn to add a value to the end of an array */
    def handlePush(obj: js.Any): js.Function0[Unit] = js.native
    
    /** Curried fn to remove an element at an index of an array */
    def handleRemove(index: Double): js.Function0[Unit] = js.native
    
    /** Curried fn to replace an element at a given index into the array */
    def handleReplace(index: Double, value: js.Any): js.Function0[Unit] = js.native
    
    /** Curried fn to swap two values in an array */
    def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit] = js.native
    
    /** Curried fn to add an element to the beginning of an array */
    def handleUnshift(value: js.Any): js.Function0[Unit] = js.native
    
    /** Imperatively insert an element at a given index into the array */
    def insert(index: Double, value: js.Any): Unit = js.native
    
    /** Imperatively move an element in an array to another index */
    def move(from: Double, to: Double): Unit = js.native
    
    var name: String = js.native
    
    /** Imperatively remove and return value from the end of the array */
    def pop[T](): js.UndefOr[T] = js.native
    
    /** Imperatively add a value to the end of an array */
    def push(obj: js.Any): Unit = js.native
    
    /** Imperatively remove and element at an index of an array */
    def remove[T](index: Double): js.UndefOr[T] = js.native
    
    /** Imperatively replace a value at an index of an array  */
    def replace(index: Double, value: js.Any): Unit = js.native
    
    /** Imperatively swap two values in an array */
    def swap(indexA: Double, indexB: Double): Unit = js.native
    
    /** Imperatively add an element to the beginning of an array and return its length */
    def unshift(value: js.Any): Double = js.native
  }
  object FieldArrayRenderProps {
    
    @scala.inline
    def apply(
      form: FormikProps[_],
      handleInsert: (Double, js.Any) => js.Function0[Unit],
      handleMove: (Double, Double) => js.Function0[Unit],
      handlePop: () => js.Function0[Unit],
      handlePush: js.Any => js.Function0[Unit],
      handleRemove: Double => js.Function0[Unit],
      handleReplace: (Double, js.Any) => js.Function0[Unit],
      handleSwap: (Double, Double) => js.Function0[Unit],
      handleUnshift: js.Any => js.Function0[Unit],
      insert: (Double, js.Any) => Unit,
      move: (Double, Double) => Unit,
      name: String,
      pop: () => js.UndefOr[js.Any],
      push: js.Any => Unit,
      remove: Double => js.UndefOr[js.Any],
      replace: (Double, js.Any) => Unit,
      swap: (Double, Double) => Unit,
      unshift: js.Any => Double
    ): FieldArrayRenderProps = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), name = name.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[FieldArrayRenderProps]
    }
    
    @scala.inline
    implicit class FieldArrayRenderPropsMutableBuilder[Self <: FieldArrayRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: FormikProps[_]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleInsert(value: (Double, js.Any) => js.Function0[Unit]): Self = StObject.set(x, "handleInsert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleMove(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "handleMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandlePop(value: () => js.Function0[Unit]): Self = StObject.set(x, "handlePop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandlePush(value: js.Any => js.Function0[Unit]): Self = StObject.set(x, "handlePush", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleRemove(value: Double => js.Function0[Unit]): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleReplace(value: (Double, js.Any) => js.Function0[Unit]): Self = StObject.set(x, "handleReplace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleSwap(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "handleSwap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHandleUnshift(value: js.Any => js.Function0[Unit]): Self = StObject.set(x, "handleUnshift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInsert(value: (Double, js.Any) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMove(value: (Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPop(value: () => js.UndefOr[js.Any]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPush(value: js.Any => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: Double => js.UndefOr[js.Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReplace(value: (Double, js.Any) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSwap(value: (Double, Double) => Unit): Self = StObject.set(x, "swap", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnshift(value: js.Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
}
