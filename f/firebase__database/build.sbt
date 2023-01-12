organization := "org.scalablytyped"
name := "firebase__database"
version := "0.13.10-961ea2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.4-517873",
  "org.scalablytyped" %%% "firebase__app-check-interop-types" % "0.1.1-7689fb",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.1-90f9cd",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.7-5c1025",
  "org.scalablytyped" %%% "firebase__component" % "0.5.21-14f95c",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.4-25e988",
  "org.scalablytyped" %%% "firebase__util" % "1.7.3-1eec82",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
