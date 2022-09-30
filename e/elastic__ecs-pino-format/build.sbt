organization := "org.scalablytyped"
name := "elastic__ecs-pino-format"
version := "1.3.0-87fa7f"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "pino" % "8.6.1-0a83e2",
  "org.scalablytyped" %%% "pino-pretty" % "4.7-dt-20220624Z-40b424",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-efc26f",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-cfa707",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
