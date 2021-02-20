package typings.fridaGum

import org.scalablytyped.runtime.StringDictionary
import typings.fridaGum.Java.MethodDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Base extends StObject {
    
    var base: js.UndefOr[X86Register] = js.native
    
    var disp: Double = js.native
    
    var index: js.UndefOr[X86Register] = js.native
    
    var scale: Double = js.native
    
    var segment: js.UndefOr[X86Register] = js.native
  }
  object Base {
    
    @scala.inline
    def apply(disp: Double, scale: Double): Base = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: X86Register): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: X86Register): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment(value: X86Register): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    }
  }
  
  @js.native
  trait BaseDisp extends StObject {
    
    var base: js.UndefOr[MipsRegister] = js.native
    
    var disp: Double = js.native
  }
  object BaseDisp {
    
    @scala.inline
    def apply(disp: Double): BaseDisp = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDisp]
    }
    
    @scala.inline
    implicit class BaseDispMutableBuilder[Self <: BaseDisp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: MipsRegister): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Block extends StObject {
    
    /**
      * Whether to generate an event whenever a basic block is executed.
      *
      * Useful to record a coarse execution trace.
      */
    var block: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to generate events for CALL/BLR instructions.
      */
    var call: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to generate an event whenever a basic block is compiled.
      *
      * Useful for coverage.
      */
    var compile: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to generate events for all instructions.
      *
      * Not recommended as it's potentially a lot of data.
      */
    var exec: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to generate events for RET instructions.
      */
    var ret: js.UndefOr[Boolean] = js.native
  }
  object Block {
    
    @scala.inline
    def apply(): Block = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: Boolean): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      @scala.inline
      def setCompile(value: Boolean): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
      
      @scala.inline
      def setExec(value: Boolean): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      @scala.inline
      def setRet(value: Boolean): Self = StObject.set(x, "ret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetUndefined: Self = StObject.set(x, "ret", js.undefined)
    }
  }
  
  @js.native
  trait Disp extends StObject {
    
    var base: js.UndefOr[ArmRegister] = js.native
    
    var disp: Double = js.native
    
    var index: js.UndefOr[ArmRegister] = js.native
    
    var scale: Double = js.native
  }
  object Disp {
    
    @scala.inline
    def apply(disp: Double, scale: Double): Disp = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disp]
    }
    
    @scala.inline
    implicit class DispMutableBuilder[Self <: Disp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: ArmRegister): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: ArmRegister): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var base: js.UndefOr[Arm64Register] = js.native
    
    var disp: Double = js.native
    
    var index: js.UndefOr[Arm64Register] = js.native
  }
  object Index {
    
    @scala.inline
    def apply(disp: Double): Index = {
      val __obj = js.Dynamic.literal(disp = disp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: Arm64Register): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setDisp(value: Double): Self = StObject.set(x, "disp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Arm64Register): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: ArmShifter = js.native
    
    var value: Double = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: ArmShifter, value: Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: ArmShifter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var `type`: Arm64Shifter = js.native
    
    var value: Double = js.native
  }
  object Value {
    
    @scala.inline
    def apply(`type`: Arm64Shifter, value: Double): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Arm64Shifter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined frida-gum.Java.Wrapper<{}> */
  @js.native
  trait Wrapper
    extends /* name */ StringDictionary[js.Any] {
    
    /**
      * Allocates a new instance without initializing it.
      *
      * Call `$init()` to initialize it.
      */
    @JSName("$alloc")
    def $alloc(params: js.Any*): js.Any = js.native
    /**
      * Allocates a new instance without initializing it.
      *
      * Call `$init()` to initialize it.
      */
    @JSName("$alloc")
    var $alloc_Original: MethodDispatcher[js.Object] = js.native
    
    /**
      * Canonical name of class being wrapped.
      */
    @JSName("$className")
    var $className: String = js.native
    
    /**
      * Eagerly deletes the underlying JNI global reference without having to
      * wait for the object to become unreachable and the JavaScript
      * runtime's garbage collector to kick in (or script to be unloaded).
      *
      * Useful when a lot of short-lived objects are created in a loop and
      * there's a risk of running out of global handles.
      */
    @JSName("$dispose")
    def $dispose(): Unit = js.native
    
    /**
      * Initializes an instance that was allocated but not yet initialized.
      * This wraps the constructor(s).
      *
      * Replace the `implementation` property to hook a given constructor.
      */
    @JSName("$init")
    def $init(params: js.Any*): js.Any = js.native
    /**
      * Initializes an instance that was allocated but not yet initialized.
      * This wraps the constructor(s).
      *
      * Replace the `implementation` property to hook a given constructor.
      */
    @JSName("$init")
    var $init_Original: MethodDispatcher[js.Object] = js.native
    
    /**
      * Allocates and initializes a new instance of the given class.
      *
      * Use this to create a new instance.
      */
    @JSName("$new")
    def $new(params: js.Any*): js.Any = js.native
    /**
      * Allocates and initializes a new instance of the given class.
      *
      * Use this to create a new instance.
      */
    @JSName("$new")
    var $new_Original: MethodDispatcher[js.Object] = js.native
    
    /**
      * Method and field names exposed by this object’s class, not including
      * parent classes.
      */
    @JSName("$ownMembers")
    var $ownMembers: js.Array[String] = js.native
    
    /**
      * Instance used for chaining up to super-class method implementations.
      */
    @JSName("$super")
    var $super: typings.fridaGum.Java.Wrapper[js.Object] = js.native
    
    /**
      * Retrieves a `java.lang.Class` wrapper for the current class.
      */
    var `class`: typings.fridaGum.Java.Wrapper[js.Object] = js.native
  }
}
