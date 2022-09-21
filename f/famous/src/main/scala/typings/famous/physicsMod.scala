package typings.famous

import typings.famous.mathMod.Mat33
import typings.famous.mathMod.Quaternion
import typings.famous.mathMod.Vec3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object physicsMod {
  
  @JSImport("famous/physics", "Angle")
  @js.native
  open class Angle protected () extends Constraint {
    def this(a: Particle, b: Particle) = this()
    def this(a: Particle, b: Particle, options: Any) = this()
  }
  
  @JSImport("famous/physics", "Box")
  @js.native
  open class Box () extends ConvexBody {
    def this(options: Any) = this()
  }
  
  @JSImport("famous/physics", "Constraint")
  @js.native
  open class Constraint () extends StObject
  
  @JSImport("famous/physics", "ConvexBody")
  @js.native
  open class ConvexBody () extends Particle {
    def this(options: IParticleOptions) = this()
  }
  
  @JSImport("famous/physics", "Drag")
  @js.native
  open class Drag () extends Force {
    def this(targets: js.Array[Any]) = this()
    def this(targets: Any) = this()
    def this(targets: js.Array[Any], options: IDragOptions) = this()
    def this(targets: Any, options: IDragOptions) = this()
    def this(targets: Unit, options: IDragOptions) = this()
    
    def init(): Unit = js.native
    
    var max: Double = js.native
    
    var strength: Double = js.native
    
    def `type`(v: Double): Double = js.native
  }
  /* static members */
  object Drag {
    
    @JSImport("famous/physics", "Drag")
    @js.native
    val ^ : js.Any = js.native
    
    inline def LINEAR(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("LINEAR")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def QUADRATIC(v: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("QUADRATIC")(v.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("famous/physics", "Force")
  @js.native
  open class Force () extends StObject {
    def this(targets: js.Array[Any]) = this()
    def this(targets: Any) = this()
    def this(targets: js.Array[Any], options: IForceOptions) = this()
    def this(targets: Any, options: IForceOptions) = this()
    def this(targets: Unit, options: IForceOptions) = this()
    
    def addTarget(target: Any): Unit = js.native
    
    def init(options: Any): Unit = js.native
    
    def removeTarget(target: Any): Unit = js.native
    
    def setOptions(options: Any): Unit = js.native
    
    var targets: js.Array[Any] = js.native
    
    def update(): Unit = js.native
    def update(time: Double): Unit = js.native
    def update(time: Double, dt: Double): Unit = js.native
    def update(time: Unit, dt: Double): Unit = js.native
  }
  
  @JSImport("famous/physics", "Particle")
  @js.native
  open class Particle () extends StObject {
    def this(options: IParticleOptions) = this()
    
    var angularMomentum: Vec3 = js.native
    
    var angularVelocity: Vec3 = js.native
    
    def applyAngularImpulse(angularImpulse: Vec3): Particle = js.native
    
    def applyForce(force: Vec3): Particle = js.native
    
    def applyImpulse(impulse: Vec3): Particle = js.native
    
    def applyTorque(torque: Vec3): Particle = js.native
    
    var collisionGroup: Double = js.native
    
    var collisionMask: Double = js.native
    
    var force: Vec3 = js.native
    
    var friction: Double = js.native
    
    def getAngularMomentum(): Vec3 = js.native
    
    def getAngularVelocity(): Vec3 = js.native
    
    def getForce(): Vec3 = js.native
    
    def getInverseMass(): Double = js.native
    
    def getMass(): Double = js.native
    
    def getMomentum(): Vec3 = js.native
    
    def getOrientation(): Quaternion = js.native
    
    def getPosition(): Vec3 = js.native
    
    def getRestrictions(): js.Array[String] = js.native
    
    def getTorque(): Vec3 = js.native
    
    def getVelocity(): Vec3 = js.native
    
    var inverseInertia: Mat33 = js.native
    
    var inverseMass: Double = js.native
    
    var localInertia: Mat33 = js.native
    
    var localInveseInertia: Mat33 = js.native
    
    var mass: Double = js.native
    
    var momentum: Vec3 = js.native
    
    def off(key: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    def on(key: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    var orientation: Quaternion = js.native
    
    var position: Vec3 = js.native
    
    var restitution: Double = js.native
    
    var restrictions: Double = js.native
    
    def setAngularMomentum(x: Double, y: Double, z: Double): Particle = js.native
    
    def setAngularVelocity(x: Double, y: Double, z: Double): Particle = js.native
    
    def setForce(x: Double, y: Double, z: Double): Particle = js.native
    
    def setMass(mass: Double): Particle = js.native
    
    def setMomentum(x: Double, y: Double, z: Double): Particle = js.native
    
    def setOrientation(w: Double, x: Double, y: Double, z: Double): Particle = js.native
    
    def setPosition(x: Double, y: Double, z: Double): Particle = js.native
    
    def setRestrictions(transRestrictions: String, rotRestrictions: String): Particle = js.native
    
    def setTorque(x: Double, y: Double, z: Double): Particle = js.native
    
    def setVelocity(x: Double, y: Double, z: Double): Particle = js.native
    
    var size: js.Array[Double] = js.native
    
    def support(): Vec3 = js.native
    
    var torque: Vec3 = js.native
    
    def trigger(key: String, payload: Any): Unit = js.native
    
    var `type`: Double = js.native
    
    def updateInertia(): Particle = js.native
    
    def updateLocalInertia(): Particle = js.native
    
    def updateShape(): Unit = js.native
    
    var velocity: Vec3 = js.native
  }
  
  @JSImport("famous/physics", "PhysicsEngine")
  @js.native
  open class PhysicsEngine () extends StObject {
    
    def add(args: Any*): PhysicsEngine = js.native
    
    def addBody(body: Any): Unit = js.native
    
    def addConstraint(body: Any): Unit = js.native
    
    def addForce(body: Any): Unit = js.native
    
    def getTransform(body: Any): IPhysicsTransform = js.native
    
    def off(key: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    def on(key: String, callback: js.Function1[/* payload */ Any, Unit]): Unit = js.native
    
    def remove(args: Any*): PhysicsEngine = js.native
    
    def removeBody(body: Any): Unit = js.native
    
    def removeConstraint(body: Any): Unit = js.native
    
    def removeForce(body: Any): Unit = js.native
    
    def setOrientation(w: Double, x: Double, y: Double, z: Double): Unit = js.native
    
    def setOrigin(x: Double, y: Double, z: Double): Unit = js.native
    
    def trigger(key: String, payload: Any): Unit = js.native
    
    def update(time: Double): Unit = js.native
  }
  
  @JSImport("famous/physics", "RotationalSpring")
  @js.native
  open class RotationalSpring () extends Force {
    def this(source: Particle) = this()
    def this(source: Unit, targets: js.Array[Particle]) = this()
    def this(source: Unit, targets: Particle) = this()
    def this(source: Particle, targets: js.Array[Particle]) = this()
    def this(source: Particle, targets: Particle) = this()
    def this(source: Unit, targets: js.Array[Particle], options: IRotationalSpringOptions) = this()
    def this(source: Unit, targets: Unit, options: IRotationalSpringOptions) = this()
    def this(source: Unit, targets: Particle, options: IRotationalSpringOptions) = this()
    def this(source: Particle, targets: js.Array[Particle], options: IRotationalSpringOptions) = this()
    def this(source: Particle, targets: Unit, options: IRotationalSpringOptions) = this()
    def this(source: Particle, targets: Particle, options: IRotationalSpringOptions) = this()
    
    var anchor: Vec3 = js.native
    
    var damping: Double = js.native
    
    var dampingRatio: Double = js.native
    
    var max: Double = js.native
    
    var period: Double = js.native
    
    var stiffness: Double = js.native
  }
  
  @JSImport("famous/physics", "Spring")
  @js.native
  open class Spring () extends Force {
    def this(source: Particle) = this()
    def this(source: Unit, targets: js.Array[Particle]) = this()
    def this(source: Unit, targets: Particle) = this()
    def this(source: Particle, targets: js.Array[Particle]) = this()
    def this(source: Particle, targets: Particle) = this()
    def this(source: Unit, targets: js.Array[Particle], options: ISpringOptions) = this()
    def this(source: Unit, targets: Unit, options: ISpringOptions) = this()
    def this(source: Unit, targets: Particle, options: ISpringOptions) = this()
    def this(source: Particle, targets: js.Array[Particle], options: ISpringOptions) = this()
    def this(source: Particle, targets: Unit, options: ISpringOptions) = this()
    def this(source: Particle, targets: Particle, options: ISpringOptions) = this()
    
    var anchor: Vec3 = js.native
    
    var damping: Double = js.native
    
    var dampingRatio: Double = js.native
    
    def init(): Unit = js.native
    def init(options: ISpringOptions): Unit = js.native
    
    var length: Double = js.native
    
    var maxLength: Double = js.native
    
    var period: Double = js.native
    
    var stiffness: Double = js.native
    
    def `type`(dist: Any, rMax: Any): Double = js.native
  }
  /* static members */
  object Spring {
    
    @JSImport("famous/physics", "Spring")
    @js.native
    val ^ : js.Any = js.native
    
    inline def FENE(dist: Any, rMax: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("FENE")(dist.asInstanceOf[js.Any], rMax.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def HOOKE(dist: Any, rMax: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HOOKE")(dist.asInstanceOf[js.Any], rMax.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("famous/physics", "Wall")
  @js.native
  open class Wall protected () extends Particle {
    def this(options: IWallOptions) = this()
    
    var invNormal: Vec3 = js.native
    
    var normal: Vec3 = js.native
  }
  
  trait IDragOptions
    extends StObject
       with IForceOptions {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var strength: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.undefined
  }
  object IDragOptions {
    
    inline def apply(): IDragOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDragOptions]
    }
    
    extension [Self <: IDragOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
      
      inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
      
      inline def setType(value: /* v */ Double => Double): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IForceOptions extends StObject {
    
    var targets: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object IForceOptions {
    
    inline def apply(): IForceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IForceOptions]
    }
    
    extension [Self <: IForceOptions](x: Self) {
      
      inline def setTargets(value: js.Array[Any]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: Any*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  trait IParticleOptions extends StObject {
    
    var collisionGroup: js.UndefOr[Double] = js.undefined
    
    var collisionMask: js.UndefOr[Double] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var mass: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[Quaternion] = js.undefined
    
    var position: js.UndefOr[Vec3] = js.undefined
    
    var restitution: js.UndefOr[Double] = js.undefined
    
    var restrictions: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[js.Array[Double]] = js.undefined
    
    var velocity: js.UndefOr[Double] = js.undefined
  }
  object IParticleOptions {
    
    inline def apply(): IParticleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParticleOptions]
    }
    
    extension [Self <: IParticleOptions](x: Self) {
      
      inline def setCollisionGroup(value: Double): Self = StObject.set(x, "collisionGroup", value.asInstanceOf[js.Any])
      
      inline def setCollisionGroupUndefined: Self = StObject.set(x, "collisionGroup", js.undefined)
      
      inline def setCollisionMask(value: Double): Self = StObject.set(x, "collisionMask", value.asInstanceOf[js.Any])
      
      inline def setCollisionMaskUndefined: Self = StObject.set(x, "collisionMask", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
      
      inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
      
      inline def setOrientation(value: Quaternion): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRestitution(value: Double): Self = StObject.set(x, "restitution", value.asInstanceOf[js.Any])
      
      inline def setRestitutionUndefined: Self = StObject.set(x, "restitution", js.undefined)
      
      inline def setRestrictions(value: Double): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
      
      inline def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
      
      inline def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
      
      inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
    }
  }
  
  trait IPhysicsTransform extends StObject {
    
    var position: js.Array[Double]
    
    var rotation: js.Array[Double]
  }
  object IPhysicsTransform {
    
    inline def apply(position: js.Array[Double], rotation: js.Array[Double]): IPhysicsTransform = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPhysicsTransform]
    }
    
    extension [Self <: IPhysicsTransform](x: Self) {
      
      inline def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value*))
      
      inline def setRotation(value: js.Array[Double]): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationVarargs(value: Double*): Self = StObject.set(x, "rotation", js.Array(value*))
    }
  }
  
  trait IRotationalSpringOptions
    extends StObject
       with IForceOptions {
    
    var anchor: js.UndefOr[Quaternion] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var dampingRatio: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var period: js.UndefOr[Double] = js.undefined
    
    var stiffness: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[js.Function2[/* dist */ Any, /* rMax */ Any, Double]] = js.undefined
  }
  object IRotationalSpringOptions {
    
    inline def apply(): IRotationalSpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRotationalSpringOptions]
    }
    
    extension [Self <: IRotationalSpringOptions](x: Self) {
      
      inline def setAnchor(value: Quaternion): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
      
      inline def setDampingRatioUndefined: Self = StObject.set(x, "dampingRatio", js.undefined)
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      inline def setType(value: (/* dist */ Any, /* rMax */ Any) => Double): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ISpringOptions
    extends StObject
       with IForceOptions {
    
    var anchor: js.UndefOr[Vec3] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var dampingRatio: js.UndefOr[Double] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var period: js.UndefOr[Double] = js.undefined
    
    var stiffness: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[js.Function2[/* dist */ Any, /* rMax */ Any, Double]] = js.undefined
  }
  object ISpringOptions {
    
    inline def apply(): ISpringOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpringOptions]
    }
    
    extension [Self <: ISpringOptions](x: Self) {
      
      inline def setAnchor(value: Vec3): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingRatio(value: Double): Self = StObject.set(x, "dampingRatio", value.asInstanceOf[js.Any])
      
      inline def setDampingRatioUndefined: Self = StObject.set(x, "dampingRatio", js.undefined)
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setPeriod(value: Double): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
      
      inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
      
      inline def setType(value: (/* dist */ Any, /* rMax */ Any) => Double): Self = StObject.set(x, "type", js.Any.fromFunction2(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IWallOptions
    extends StObject
       with IParticleOptions {
    
    var direction: js.UndefOr[Double] = js.undefined
  }
  object IWallOptions {
    
    inline def apply(): IWallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWallOptions]
    }
    
    extension [Self <: IWallOptions](x: Self) {
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    }
  }
}
