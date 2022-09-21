package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.Java.MethodDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base extends StObject {
    
    var base: js.UndefOr[X86Register] = js.undefined
    
    var disp: Double
    
    var index: js.UndefOr[X86Register] = js.undefined
    
    var scale: Double
    
    var segment: js.UndefOr[X86Register] = js.undefined
  }
  object Base {
    
    inline def apply(disp: Double, scale: Double): Base = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    extension [Self <: Base](x: Self) {
      
      inline def setBase(value: X86Register): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: X86Register): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSegment(value: X86Register): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    }
  }
  
  trait BaseDisp extends StObject {
    
    var base: js.UndefOr[MipsRegister] = js.undefined
    
    var disp: Double
  }
  object BaseDisp {
    
    inline def apply(disp: Double): BaseDisp = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDisp]
    }
    
    extension [Self <: BaseDisp](x: Self) {
      
      inline def setBase(value: MipsRegister): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Block extends StObject {
    
    /**
      * Whether to generate an event whenever a basic block is executed.
      *
      * Useful to record a coarse execution trace.
      */
    var block: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to generate events for CALL/BLR instructions.
      */
    var call: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to generate an event whenever a basic block is compiled.
      *
      * Useful for coverage.
      */
    var compile: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to generate events for all instructions.
      *
      * Not recommended as it's potentially a lot of data.
      */
    var exec: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to generate events for RET instructions.
      */
    var ret: js.UndefOr[Boolean] = js.undefined
  }
  object Block {
    
    inline def apply(): Block = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Block]
    }
    
    extension [Self <: Block](x: Self) {
      
      inline def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setCompile(value: Boolean): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
      
      inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      inline def setExec(value: Boolean): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setRet(value: Boolean): Self = StObject.set(x, "ret", value.asInstanceOf[js.Any])
      
      inline def setRetUndefined: Self = StObject.set(x, "ret", js.undefined)
    }
  }
  
  trait Disp extends StObject {
    
    var base: js.UndefOr[ArmRegister] = js.undefined
    
    var disp: Double
    
    var index: js.UndefOr[ArmRegister] = js.undefined
    
    var scale: Double
  }
  object Disp {
    
    inline def apply(disp: Double, scale: Double): Disp = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disp]
    }
    
    extension [Self <: Disp](x: Self) {
      
      inline def setBase(value: ArmRegister): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: ArmRegister): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var base: js.UndefOr[Arm64Register] = js.undefined
    
    var disp: Double
    
    var index: js.UndefOr[Arm64Register] = js.undefined
  }
  object Index {
    
    inline def apply(disp: Double): Index = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setBase(value: Arm64Register): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Arm64Register): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: ArmShifter
    
    var value: Double
  }
  object Type {
    
    inline def apply(`type`: ArmShifter, value: Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: ArmShifter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var `type`: Arm64Shifter
    
    var value: Double
  }
  object Value {
    
    inline def apply(`type`: Arm64Shifter, value: Double): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setType(value: Arm64Shifter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined frida-gum.Java.Wrapper<{}> */
  trait Wrapper
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    /**
      * Allocates a new instance without initializing it.
      *
      * Call `$init()` to initialize it.
      */
    @JSName("$alloc")
    def $alloc(params: Any*): Any
    /**
      * Allocates a new instance without initializing it.
      *
      * Call `$init()` to initialize it.
      */
    @JSName("$alloc")
    var $alloc_Original: MethodDispatcher[js.Object]
    
    /**
      * Canonical name of class being wrapped.
      */
    @JSName("$className")
    var $className: String
    
    /**
      * Eagerly deletes the underlying JNI global reference without having to
      * wait for the object to become unreachable and the JavaScript
      * runtime's garbage collector to kick in (or script to be unloaded).
      *
      * Useful when a lot of short-lived objects are created in a loop and
      * there's a risk of running out of global handles.
      */
    @JSName("$dispose")
    def $dispose(): Unit
    
    /**
      * Initializes an instance that was allocated but not yet initialized.
      * This wraps the constructor(s).
      *
      * Replace the `implementation` property to hook a given constructor.
      */
    @JSName("$init")
    def $init(params: Any*): Any
    /**
      * Initializes an instance that was allocated but not yet initialized.
      * This wraps the constructor(s).
      *
      * Replace the `implementation` property to hook a given constructor.
      */
    @JSName("$init")
    var $init_Original: MethodDispatcher[js.Object]
    
    /**
      * Allocates and initializes a new instance of the given class.
      *
      * Use this to create a new instance.
      */
    @JSName("$new")
    def $new(params: Any*): Any
    /**
      * Allocates and initializes a new instance of the given class.
      *
      * Use this to create a new instance.
      */
    @JSName("$new")
    var $new_Original: MethodDispatcher[js.Object]
    
    /**
      * Method and field names exposed by this object’s class, not including
      * parent classes.
      */
    @JSName("$ownMembers")
    var $ownMembers: js.Array[String]
    
    /**
      * Instance used for chaining up to super-class method implementations.
      */
    @JSName("$super")
    var $super: typings.fridaGum.Java.Wrapper[js.Object]
    
    /**
      * Retrieves a `java.lang.Class` wrapper for the current class.
      */
    var `class`: typings.fridaGum.Java.Wrapper[js.Object]
  }
  object Wrapper {
    
    inline def apply(
      $alloc: MethodDispatcher[js.Object],
      $className: String,
      $dispose: () => Unit,
      $init: MethodDispatcher[js.Object],
      $new: MethodDispatcher[js.Object],
      $ownMembers: js.Array[String],
      $super: typings.fridaGum.Java.Wrapper[js.Object],
      `class`: typings.fridaGum.Java.Wrapper[js.Object]
    ): Wrapper = {
      val __obj = js.Dynamic.literal($alloc = $alloc.asInstanceOf[js.Any], $className = $className.asInstanceOf[js.Any], $dispose = js.Any.fromFunction0($dispose), $init = $init.asInstanceOf[js.Any], $new = $new.asInstanceOf[js.Any], $ownMembers = $ownMembers.asInstanceOf[js.Any], $super = $super.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Wrapper]
    }
    
    extension [Self <: Wrapper](x: Self) {
      
      inline def set$alloc(value: MethodDispatcher[js.Object]): Self = StObject.set(x, "$alloc", value.asInstanceOf[js.Any])
      
      inline def set$className(value: String): Self = StObject.set(x, "$className", value.asInstanceOf[js.Any])
      
      inline def set$dispose(value: () => Unit): Self = StObject.set(x, "$dispose", js.Any.fromFunction0(value))
      
      inline def set$init(value: MethodDispatcher[js.Object]): Self = StObject.set(x, "$init", value.asInstanceOf[js.Any])
      
      inline def set$new(value: MethodDispatcher[js.Object]): Self = StObject.set(x, "$new", value.asInstanceOf[js.Any])
      
      inline def set$ownMembers(value: js.Array[String]): Self = StObject.set(x, "$ownMembers", value.asInstanceOf[js.Any])
      
      inline def set$ownMembersVarargs(value: String*): Self = StObject.set(x, "$ownMembers", js.Array(value*))
      
      inline def set$super(value: typings.fridaGum.Java.Wrapper[js.Object]): Self = StObject.set(x, "$super", value.asInstanceOf[js.Any])
      
      inline def setClass(value: typings.fridaGum.Java.Wrapper[js.Object]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    }
  }
}
