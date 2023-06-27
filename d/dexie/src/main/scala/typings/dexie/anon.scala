package typings.dexie

import typings.dexie.dexieStrings.dbcore
import typings.dexie.mod.DBCoreKeyRange
import typings.dexie.mod.IndexableType
import typings.dexie.mod.IndexableTypePart
import typings.std.IDBKeyRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `0`: Any
    
    var `1`: Any
  }
  object `0` {
    
    inline def apply(`0`: Any, `1`: Any): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def set0(value: Any): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: Any): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var stack: dbcore
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(stack = "dbcore")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setStack(value: dbcore): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllKeys[B /* <: Boolean */] extends StObject {
    
    var allKeys: B
  }
  object AllKeys {
    
    inline def apply[B /* <: Boolean */](allKeys: B): AllKeys[B] = {
      val __obj = js.Dynamic.literal(allKeys = allKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllKeys[B]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllKeys[?], B /* <: Boolean */] (val x: Self & AllKeys[B]) extends AnyVal {
      
      inline def setAllKeys(value: B): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait AllKeysBoolean extends StObject {
    
    var allKeys: Boolean
  }
  object AllKeysBoolean {
    
    inline def apply(allKeys: Boolean): AllKeysBoolean = {
      val __obj = js.Dynamic.literal(allKeys = allKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllKeysBoolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllKeysBoolean] (val x: Self) extends AnyVal {
      
      inline def setAllKeys(value: Boolean): Self = StObject.set(x, "allKeys", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bound extends StObject {
    
    var bound: js.Function
    
    var lowerBound: js.Function
    
    var upperBound: js.Function
  }
  object Bound {
    
    inline def apply(bound: js.Function, lowerBound: js.Function, upperBound: js.Function): Bound = {
      val __obj = js.Dynamic.literal(bound = bound.asInstanceOf[js.Any], lowerBound = lowerBound.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bound]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bound] (val x: Self) extends AnyVal {
      
      inline def setBound(value: js.Function): Self = StObject.set(x, "bound", value.asInstanceOf[js.Any])
      
      inline def setLowerBound(value: js.Function): Self = StObject.set(x, "lowerBound", value.asInstanceOf[js.Any])
      
      inline def setUpperBound(value: js.Function): Self = StObject.set(x, "upperBound", value.asInstanceOf[js.Any])
    }
  }
  
  trait IncludeLowers extends StObject {
    
    var includeLowers: js.UndefOr[Boolean] = js.undefined
    
    var includeUppers: js.UndefOr[Boolean] = js.undefined
  }
  object IncludeLowers {
    
    inline def apply(): IncludeLowers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeLowers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncludeLowers] (val x: Self) extends AnyVal {
      
      inline def setIncludeLowers(value: Boolean): Self = StObject.set(x, "includeLowers", value.asInstanceOf[js.Any])
      
      inline def setIncludeLowersUndefined: Self = StObject.set(x, "includeLowers", js.undefined)
      
      inline def setIncludeUppers(value: Boolean): Self = StObject.set(x, "includeUppers", value.asInstanceOf[js.Any])
      
      inline def setIncludeUppersUndefined: Self = StObject.set(x, "includeUppers", js.undefined)
    }
  }
  
  trait Index extends StObject {
    
    var index: String | Null
    
    var range: DBCoreKeyRange
  }
  object Index {
    
    inline def apply(range: DBCoreKeyRange): Index = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], index = null)
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexNull: Self = StObject.set(x, "index", null)
      
      inline def setRange(value: DBCoreKeyRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key[TKey] extends StObject {
    
    var key: IndexableType
    
    var primaryKey: TKey
  }
  object Key {
    
    inline def apply[TKey](key: IndexableType, primaryKey: TKey): Key[TKey] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key[?], TKey] (val x: Self & Key[TKey]) extends AnyVal {
      
      inline def setKey(value: IndexableType): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: (js.Array[Unit] | IndexableTypePart)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setPrimaryKey(value: TKey): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var stack: dbcore
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], stack = "dbcore")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: dbcore): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  trait Open extends StObject {
    
    var open: js.Function
  }
  object Open {
    
    inline def apply(open: js.Function): Open = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Open]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
      
      inline def setOpen(value: js.Function): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrimaryKey[TKey] extends StObject {
    
    var key: Any
    
    var primaryKey: TKey
  }
  object PrimaryKey {
    
    inline def apply[TKey](key: Any, primaryKey: TKey): PrimaryKey[TKey] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrimaryKey[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrimaryKey[?], TKey] (val x: Self & PrimaryKey[TKey]) extends AnyVal {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKey(value: TKey): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stack extends StObject {
    
    var stack: String
  }
  object Stack {
    
    inline def apply(stack: String): Stack = {
      val __obj = js.Dynamic.literal(stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stack] (val x: Self) extends AnyVal {
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofIDBKeyRange extends StObject {
    
    /**
      * Returns a new IDBKeyRange spanning from lower to upper. If lowerOpen is true, lower is not included in the range. If upperOpen is true, upper is not included in the range.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/bound)
      */
    /* standard dom */
    def bound(lower: Any, upper: Any): IDBKeyRange = js.native
    def bound(lower: Any, upper: Any, lowerOpen: Boolean): IDBKeyRange = js.native
    def bound(lower: Any, upper: Any, lowerOpen: Boolean, upperOpen: Boolean): IDBKeyRange = js.native
    def bound(lower: Any, upper: Any, lowerOpen: Unit, upperOpen: Boolean): IDBKeyRange = js.native
    
    /**
      * Returns a new IDBKeyRange starting at key with no upper bound. If open is true, key is not included in the range.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerBound)
      */
    /* standard dom */
    def lowerBound(lower: Any): IDBKeyRange = js.native
    def lowerBound(lower: Any, open: Boolean): IDBKeyRange = js.native
    
    /**
      * Returns a new IDBKeyRange spanning only key.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/only)
      */
    /* standard dom */
    def only(value: Any): IDBKeyRange = js.native
    
    /**
      * Returns a new IDBKeyRange with no lower bound and ending at key. If open is true, key is not included in the range.
      *
      * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperBound)
      */
    /* standard dom */
    def upperBound(upper: Any): IDBKeyRange = js.native
    def upperBound(upper: Any, open: Boolean): IDBKeyRange = js.native
  }
  
  trait Value[T] extends StObject {
    
    var value: T
  }
  object Value {
    
    inline def apply[T](value: T): Value[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value[?], T] (val x: Self & Value[T]) extends AnyVal {
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
